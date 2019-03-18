package com.archu.arsenalfc.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.archu.arsenalfc.model.Tile;
import com.bumptech.glide.Glide;

import java.util.List;

import com.archu.arsenalfc.R;

public class TilesAdapter extends RecyclerView.Adapter<TilesAdapter.MyViewHolder> {

    private Context context;
    private List<Tile> tilesList;


    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;
        public ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView);
            imageView = view.findViewById(R.id.imageView);
        }
    }

    public TilesAdapter(Context context, List<Tile> tilesList) {
        this.context = context;
        this.tilesList = tilesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.tile_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        Tile tile = tilesList.get(position);
        holder.textView.setText(tile.getTextView());


        Glide.with(context).load(tile.getImageView()).into(holder.imageView);
    }


    @Override
    public int getItemCount() {
        return tilesList.size();
    }
}
