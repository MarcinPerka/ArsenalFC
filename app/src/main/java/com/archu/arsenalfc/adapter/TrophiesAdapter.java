package com.archu.arsenalfc.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

import com.archu.arsenalfc.R;

public class TrophiesAdapter extends RecyclerView.Adapter<TrophiesAdapter.MyViewHolder> {

    private List<String> descriptions;
    private List<String> trophies;
    private Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView description;
        public TextView trophy;


        public MyViewHolder(View view) {
            super(view);
            description = view.findViewById(R.id.description);
            trophy = view.findViewById(R.id.trophy);
        }
    }

    public TrophiesAdapter(Context context, List<String> trophies, List<String> descriptions) {
        this.context = context;
        this.descriptions = descriptions;
        this.trophies = trophies;
    }

    @Override
    public TrophiesAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.timeline_card, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final TrophiesAdapter.MyViewHolder holder, int position) {
        holder.description.setText(descriptions.get(position));
        holder.trophy.setText(trophies.get(position));
    }

    @Override
    public int getItemCount() {
        return descriptions.size();
    }

}
