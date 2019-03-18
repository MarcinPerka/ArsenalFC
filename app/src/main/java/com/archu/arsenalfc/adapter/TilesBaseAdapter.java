package com.archu.arsenalfc.adapter;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.archu.arsenalfc.model.Tile;
import com.bumptech.glide.Glide;
import com.huxq17.swipecardsview.BaseCardAdapter;

import java.util.List;

import com.archu.arsenalfc.R;

public class TilesBaseAdapter extends BaseCardAdapter {

    private List<Tile> tilesList;
    private Context context;

    public TilesBaseAdapter(List<Tile> tilesList, Context context) {
        this.tilesList = tilesList;
        this.context = context;
    }

    @Override
    public int getCount() {
        return tilesList.size();
    }

    @Override
    public int getCardLayoutId() {
        return R.layout.tile_card;
    }

    @Override
    public void onBindData(int position, View cardview) {
        if (tilesList == null || tilesList.size() == 0) {
            return;
        }
        ImageView imageView = cardview.findViewById(R.id.imageView);
        TextView textView = cardview.findViewById(R.id.textView);
        Tile tile = tilesList.get(position);
        textView.setText(tile.getTextView());
        Glide.with(context).load(tile.getImageView()).into(imageView);
    }
}
