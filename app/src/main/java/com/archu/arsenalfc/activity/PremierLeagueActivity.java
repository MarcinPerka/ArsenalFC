package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.archu.arsenalfc.R;

public class PremierLeagueActivity extends Activity implements View.OnClickListener {

    private ImageButton tableBtn, scheduleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_premier_league);
        tableBtn = findViewById(R.id.tableBtn);
        tableBtn.setOnClickListener(this);

        scheduleBtn = findViewById(R.id.scheduleBtn);
        scheduleBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        Intent intent = new Intent(PremierLeagueActivity.this, WebViewActivity.class);
        switch (id) {
            case R.id.tableBtn:
                intent.putExtra("url", "https://www.flashscore.pl/tabela/zoZ4r7jR/v1t6uXL7/#table;overall");
                startActivity(intent);
                break;
            case R.id.scheduleBtn:
                intent.putExtra("url", "https://www.flashscore.pl/druzyna/arsenal/hA1Zm19f/");
                startActivity(intent);
                break;
        }
    }
}
