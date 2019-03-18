package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.archu.arsenalfc.R;


public class PlayerActivity extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        initIntent();
    }

    private void initIntent() {

        if (getIntent().hasExtra("position") && getIntent().hasExtra("image") && getIntent().hasExtra("name") && getIntent().hasExtra("age") && getIntent().hasExtra("country")) {
            int defaultValue = -1;
            String image = getIntent().getStringExtra("image");
            String position = getIntent().getStringExtra("position");
            String name = getIntent().getStringExtra("name");
            int age = getIntent().getIntExtra("age", defaultValue);
            String country = getIntent().getStringExtra("country");
            setImage(image, position, name, age, country);
        }
    }


    private void setImage(String img, String p, String n, int a, String c) {
        TextView positionTxt = findViewById(R.id.positionTxt);
        positionTxt.setText("Pozycja: " + p);

        TextView nameTxt = findViewById(R.id.nameTxt);
        nameTxt.setText("Imię i nazwisko: " + n);

        TextView ageTxt = findViewById(R.id.ageTxt);
        ageTxt.setText("Wiek: " + Integer.toString(a));

        ImageView country = findViewById(R.id.countryTxt);
        ImageView imageViewPlayer = findViewById(R.id.imageViewPlayer);
        Glide.with(this).load(img).into(imageViewPlayer);
        Glide.with(this).load(c).into(country);
    }
}
