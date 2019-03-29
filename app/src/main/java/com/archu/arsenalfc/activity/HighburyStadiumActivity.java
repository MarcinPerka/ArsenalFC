package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.archu.arsenalfc.R;
import com.archu.arsenalfc.adapter.StadiumAdapter;

public class HighburyStadiumActivity extends Activity {

    private List<Integer> highburyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_highbury);
        highburyList = new ArrayList<>();

        initImages();
    }

    private void initImages() {
        highburyList.add(R.drawable.hs1);
        highburyList.add(R.drawable.hs2);
        highburyList.add(R.drawable.hs3);
        highburyList.add(R.drawable.hs4);
        highburyList.add(R.drawable.hs5);
        highburyList.add(R.drawable.hs6);
        highburyList.add(R.drawable.hs7);
        highburyList.add(R.drawable.hs8);
        highburyList.add(R.drawable.hs9);

        initRecyclerView();
    }

    private void initRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        StadiumAdapter adapter = new StadiumAdapter(this, highburyList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }
}

