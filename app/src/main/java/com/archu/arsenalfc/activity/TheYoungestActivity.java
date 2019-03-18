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

public class TheYoungestActivity extends Activity {

    private List<Tile> tilesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_youngest);
        tilesList = new ArrayList<>();

        initTiles();
    }

    private void initTiles() {
        Tile tile = new Tile("We wszystkich rozgrywkach: Cesc Fabregas.\n16 lat i 177 dni.\nDebiut przeciwko Rotherham Utd 28.10.2003 r..", R.drawable.fabregas_rotherham);
        tilesList.add(tile);

        tile = new Tile("We wszystkich rozgrywkach przed Fabregasem: Jermaine Pennant.\n16 lat 319 dni.\nMecz przeciwko Middlesbrough 30.11.1999 r..", R.drawable.pennant_middlesbrough);
        tilesList.add(tile);

        tile = new Tile("W lidze: Gerry Ward.\n16 lat 321 dni.\nMecz z Huddersfield Town 22.09.1953 r..", R.drawable.gerry_ward);
        tilesList.add(tile);

        tile = new Tile("W Premiership: Cesc Fabregas.\n17 lat 103 dni.\nMecz z Evertonem 15.09.2004 r..", R.drawable.fabregas_everton);
        tilesList.add(tile);

        tile = new Tile("W Europejskich Pucharach: Cesc Fabregas.\n17 lat 169 dni.\nMecz z Panathinaikos 20.10.2004 r..", R.drawable.fabregas_panathinaikos);
        tilesList.add(tile);

        tile = new Tile("W FA Cup: Stewart Robson.\n17 lat i 57 dni.\nDebiut przeciwko Tottenhamowi 02.01.1982 r..", R.drawable.stewart_robson);
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
