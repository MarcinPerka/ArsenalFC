package com.archu.arsenalfc.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.archu.arsenalfc.model.Player;
import com.archu.arsenalfc.activity.PlayerActivity;
import com.bumptech.glide.Glide;

import java.util.List;

import com.archu.arsenalfc.R;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.MyViewHolder> {

    private List<Player> players;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nameTxt;
        public ImageView imageView;
        RelativeLayout parentLayout;

        public MyViewHolder(View view) {
            super(view);
            nameTxt = view.findViewById(R.id.nameTxt);
            imageView = view.findViewById(R.id.imageView);
            parentLayout = view.findViewById(R.id.parent_layout);
        }
    }

    public PlayerAdapter(Context context, List<Player> players) {
        this.context = context;
        this.players = players;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.player_card, parent, false);
        MyViewHolder holder = new MyViewHolder(itemView);
        return holder;
    }


    @Override
    public void onBindViewHolder(final PlayerAdapter.MyViewHolder holder, final int position) {
        final Player player = players.get(position);
        holder.nameTxt.setText(player.getName());

        Glide.with(context).load(player.getImgId()).into(holder.imageView);

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, PlayerActivity.class);
                intent.putExtra("image", players.get(position).getImgId());
                intent.putExtra("position", players.get(position).getPosition());
                intent.putExtra("name", players.get(position).getName());
                intent.putExtra("age", players.get(position).getAge());
                intent.putExtra("country", players.get(position).getCountry());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return players.size();
    }
}
