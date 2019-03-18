package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.archu.arsenalfc.R;
import com.archu.arsenalfc.adapter.TrophiesAdapter;

public class TrophiesActivity extends Activity {

    private List<String> trophies;
    private List<String> descriptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophies);
        trophies = new ArrayList<>();
        descriptions = new ArrayList<>();

        initTimeLine();
    }

    public void initTimeLine() {

        try {
            InputStream inputStream = this.getAssets().open("trophies.txt");
            Scanner in = new Scanner(inputStream);
            while (in.hasNextLine()) {
                trophies.add(in.nextLine());
                descriptions.add(in.nextLine());
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        initRecyclerView();
    }

    private void initRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        TrophiesAdapter adapter = new TrophiesAdapter(this, trophies, descriptions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);
    }
}
