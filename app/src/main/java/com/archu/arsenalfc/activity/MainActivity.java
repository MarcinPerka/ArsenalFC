package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.archu.arsenalfc.R;

public class MainActivity extends Activity implements View.OnClickListener {

    private ImageButton squadBtn, stadiumBtn, moreInfoBtn, curiositiesBtn, premierLeagueBtn,
            trophiesBtn, achievmentsBtn, injuriesBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stadiumBtn = findViewById(R.id.stadiumBtn);
        stadiumBtn.setOnClickListener(this);
        moreInfoBtn = findViewById(R.id.moreInfoBtn);
        moreInfoBtn.setOnClickListener(this);
        squadBtn = findViewById(R.id.squadBtn);
        squadBtn.setOnClickListener(this);
        curiositiesBtn = findViewById(R.id.curiositiesBtn);
        curiositiesBtn.setOnClickListener(this);
        premierLeagueBtn = findViewById(R.id.premierLeagueBtn);
        premierLeagueBtn.setOnClickListener(this);
        trophiesBtn = findViewById(R.id.trophiesBtn);
        trophiesBtn.setOnClickListener(this);
        achievmentsBtn = findViewById(R.id.achievementsBtn);
        achievmentsBtn.setOnClickListener(this);
        injuriesBtn = findViewById(R.id.injuriesBtn);
        injuriesBtn.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent;
        switch (id) {
            case R.id.moreInfoBtn:
                intent = new Intent(MainActivity.this, MoreInfoActivity.class);
                startActivity(intent);
                break;
            case R.id.stadiumBtn:
                intent = new Intent(MainActivity.this, StadiumActivity.class);
                startActivity(intent);
                break;
            case R.id.squadBtn:
                intent = new Intent(MainActivity.this, SquadActivity.class);
                startActivity(intent);
                break;
            case R.id.curiositiesBtn:
                intent = new Intent(MainActivity.this, CuriositiesActivity.class);
                startActivity(intent);
                break;
            case R.id.premierLeagueBtn:
                intent = new Intent(MainActivity.this, PremierLeagueActivity.class);
                startActivity(intent);
                break;
            case R.id.trophiesBtn:
                intent = new Intent(MainActivity.this, TrophiesActivity.class);
                startActivity(intent);
                break;
            case R.id.achievementsBtn:
                intent = new Intent(MainActivity.this, AchivementsActivity.class);
                startActivity(intent);
                break;
            case R.id.injuriesBtn:
                intent = new Intent(MainActivity.this, InjuryActivity.class);
                startActivity(intent);
                break;
        }
    }
}

