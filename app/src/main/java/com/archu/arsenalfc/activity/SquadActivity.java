package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.archu.arsenalfc.R;
import com.archu.arsenalfc.adapter.PlayerAdapter;
import com.archu.arsenalfc.model.Player;

public class SquadActivity extends Activity {
    private List<Player> players;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squad);
        players = new ArrayList<>();

        initPlayers();
    }

    private void initPlayers() {
        try {
            InputStream inputStream = this.getAssets().open("input.txt");
            Scanner in = new Scanner(inputStream);
            while (in.hasNextLine()) {
                String position = in.next();
                String firstName = in.next();
                String lastName = in.next();
                String country = in.next();
                int age = in.nextInt();
                String image = in.next();
                players.add(new Player(position, firstName + " " + lastName, country, age, image));

            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        PlayerAdapter adapter = new PlayerAdapter(this, players);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
