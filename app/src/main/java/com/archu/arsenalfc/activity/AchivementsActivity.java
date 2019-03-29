package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.archu.arsenalfc.R;

public class AchivementsActivity extends Activity implements View.OnClickListener {

    private ImageButton theYoungestBtn, theOldestBtn, attendanceBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        theYoungestBtn = findViewById(R.id.theYoungestBtn);
        theOldestBtn = findViewById(R.id.theOldestBtn);
        attendanceBtn = findViewById(R.id.attendanceBtn);

        theYoungestBtn.setOnClickListener(this);
        theOldestBtn.setOnClickListener(this);
        attendanceBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        Intent intent;
        switch (id) {
            case R.id.theYoungestBtn:
                intent = new Intent(AchivementsActivity.this, TheYoungestPlayersActivity.class);
                startActivity(intent);
                break;
            case R.id.theOldestBtn:
                intent = new Intent(AchivementsActivity.this, TheOldestPlayersActivity.class);
                startActivity(intent);
                break;
            case R.id.attendanceBtn:
                intent = new Intent(AchivementsActivity.this, TheMostMatchesActivity.class);
                startActivity(intent);
                break;
        }
    }
}
