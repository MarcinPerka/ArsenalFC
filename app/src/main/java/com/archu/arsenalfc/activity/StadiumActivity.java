package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;

import com.archu.arsenalfc.R;


public class StadiumActivity extends Activity implements View.OnClickListener {

    private ImageButton emiratesStadiumBtn, highburyStadiumBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium);
        emiratesStadiumBtn = findViewById(R.id.emiratesStadiumBtn);
        highburyStadiumBtn = findViewById(R.id.highburyStadiumBtn);
        emiratesStadiumBtn.setOnClickListener(this);
        highburyStadiumBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;
        switch (id) {
            case R.id.emiratesStadiumBtn:
                intent = new Intent(StadiumActivity.this, EmiratesActivity.class);
                startActivity(intent);
                break;
            case R.id.highburyStadiumBtn:
                intent = new Intent(StadiumActivity.this, HighburyActivity.class);
                startActivity(intent);
                break;
        }
    }
}




