package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.archu.arsenalfc.R;
import com.archu.arsenalfc.adapter.TilesAdapter;
import com.archu.arsenalfc.model.Tile;

public class TheOldestPlayersActivity extends Activity {

    private List<Tile> tilesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_oldest_players);
        tilesList = new ArrayList<>();

        initTiles();
    }

    private void initTiles() {
        Tile tile = new Tile("We wszystkich rozgrywkach: Jock Rutherford.\n41 lat 159 dni.\nMecz z Man City, 20.03.1926 r..", R.drawable.jock_rutherford);
        tilesList.add(tile);

        tile = new Tile("W lidze: Jock Rutherford.\n41 lat 159 dni.\nMecz z Man City, 20.03.1926 r..", R.drawable.jock_rutherford);
        tilesList.add(tile);

        tile = new Tile("W Premiership: John Lukic.\n39 lat 336 dni.\nMecz z Derby County, 11.11.2000 r..", R.drawable.john_lukic);
        tilesList.add(tile);

        tile = new Tile("W Europejskich pucharach: John Lukic.\n39 lat 311 dni.\nMecz z Lazio, Liga Mistrzów, 17.10.2000 r..", R.drawable.john_lukic2);
        tilesList.add(tile);


        initRecyclerView();
    }

    private void initRecyclerView() {

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        TilesAdapter adapter = new TilesAdapter(this, tilesList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }
}
