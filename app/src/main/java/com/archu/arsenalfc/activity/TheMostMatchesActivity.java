package com.archu.arsenalfc.activity;

import android.app.Activity;
import android.os.Bundle;

import com.archu.arsenalfc.adapter.TilesBaseAdapter;
import com.archu.arsenalfc.model.Tile;
import com.huxq17.swipecardsview.BaseCardAdapter;
import com.huxq17.swipecardsview.SwipeCardsView;

import java.util.ArrayList;
import java.util.List;

import com.archu.arsenalfc.R;

public class TheMostMatchesActivity extends Activity {

    private List tilesList;
    private SwipeCardsView swipeCardsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_most_matches);
        tilesList = new ArrayList<>();
        swipeCardsView = findViewById(R.id.swipeCardsView);
        swipeCardsView.retainLastCard(false);
        swipeCardsView.enableSwipe(true);

        initTiles();
    }

    private void initTiles() {
        Tile tile = new Tile("Ogółem: 722 David O'Leary.\nDebiut 16 sierpnia 1975.", R.drawable.david_oleary);
        tilesList.add(tile);

        tile = new Tile("W lidze: 558 David O'Leary.\nDebiut 16 sierpnia 1975.", R.drawable.david_oleary2);
        tilesList.add(tile);

        tile = new Tile("W Premiership: 333 Ray Parlour.\nDrugi jest David Seaman - 325 meczów.", R.drawable.ray_parlour);
        tilesList.add(tile);

        tile = new Tile("W Europejskich Pucharach: 78 Thierry Henry.\n69 David Seaman, 68 Patrick Vieira.", R.drawable.thierry_henry);
        tilesList.add(tile);

        tile = new Tile("W Lidze mistrzów: 70 Thierry Henry.\n63 Robert Pires, 60 Freddie Ljungberg.", R.drawable.thierry_henry2);
        tilesList.add(tile);

        tile = new Tile("Z rzędu: 172 Tom Parker.\n3 kwietnia 1926 - 26 grudnia 1929.", R.drawable.tom_parker);
        tilesList.add(tile);

        BaseCardAdapter adapter = new TilesBaseAdapter(tilesList, this);
        swipeCardsView.setAdapter(adapter);
    }
}
