package com.example.progmobiletp05;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.DataViewHolder> {
    private Context context;
    private ArrayList<Data> data;
    private static RecyclerClickListener recyclerClickListener;

    public RecyclerViewAdapter(Context context, ArrayList<Data> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item, parent, false);
        return new DataViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataViewHolder container, int position) {
        String name = data.get(position).getName();
        container.name.setText(name);
        String desc = data.get(position).getDescription();
        container.description.setText(desc);
        container.image.setImageResource(data.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public static class DataViewHolder extends RecyclerView.ViewHolder  {
        TextView name;
        TextView description;
        ImageView image;

        public DataViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            description = (TextView) itemView.findViewById(R.id.size);
            image = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }
}

