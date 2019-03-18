package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.archu.arsenalfc.R;

public class CuriositiesActivity extends Activity implements View.OnClickListener {
    private ImageButton randomBtn;
    private TextView randomTxt;
    private List<String> lines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curiosities);
        randomBtn = findViewById(R.id.randomBtn);
        randomTxt = findViewById(R.id.randomTxt);
        randomBtn.setOnClickListener(this);
        lines = new ArrayList<>();

        try {
            InputStream inputStream = getClass().getResourceAsStream("/assets/curiosities.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = bufferedReader.readLine()) != null)
                lines.add(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        Random rand = new Random();
        int randomIndex = rand.nextInt(lines.size());
        randomTxt.setText(lines.get(randomIndex));

    }
}
