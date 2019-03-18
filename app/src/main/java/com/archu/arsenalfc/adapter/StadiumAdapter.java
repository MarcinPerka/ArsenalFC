package com.archu.arsenalfc.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

import com.archu.arsenalfc.R;

public class StadiumAdapter extends RecyclerView.Adapter<StadiumAdapter.MyViewHolder> {

    private Context context;
    private List<Integer> stadiumList;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            imageView = view.findViewById(R.id.imageView);
        }
    }

    public StadiumAdapter(Context context, List<Integer> stadiumList) {
        this.context = context;
        this.stadiumList = stadiumList;
    }

    @Override
    public StadiumAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.stadium_card, parent, false);

        return new StadiumAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final StadiumAdapter.MyViewHolder holder, int position) {
        Glide.with(context).load(stadiumList.get(position)).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return stadiumList.size();
    }
}
