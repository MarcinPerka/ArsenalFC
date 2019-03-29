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

public class EmiratesStadiumActivity extends Activity {

    private List<Integer> emiratesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emirates);
        emiratesList = new ArrayList<>();

        initImages();
    }

    private void initImages() {
        emiratesList.add(R.drawable.es1);
        emiratesList.add(R.drawable.es2);
        emiratesList.add(R.drawable.es3);
        emiratesList.add(R.drawable.es4);
        emiratesList.add(R.drawable.es5);
        emiratesList.add(R.drawable.es6);
        emiratesList.add(R.drawable.es7);
        emiratesList.add(R.drawable.es8);


        initRecyclerView();
    }

    private void initRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        StadiumAdapter adapter = new StadiumAdapter(this, emiratesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }
}
