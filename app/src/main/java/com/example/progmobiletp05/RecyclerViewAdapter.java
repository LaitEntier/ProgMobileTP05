package com.example.progmobiletp05;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.DataViewHolder> {
        private ArrayList<Data> donnees;

        public RecyclerViewAdapter(ArrayList<Data> donnees) {
            this.donnees = donnees;
        }

        @Override
        public DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.recyclerview_item, parent, false);
            return new DataViewHolder(view);
        }

        @Override
        public void onBindViewHolder(DataViewHolder conteneur, int position) {
            conteneur.tv_principal.setText(donnees.get(position).getPrincipal());
            conteneur.tv_auxiliaire.setText(donnees.get(position).getAuxiliaire());
        }

        @Override
        public int getItemCount() {
            return donnees.size();
        }

        public static class DataViewHolder extends RecyclerView.ViewHolder {
        TextView tv_principal;
        TextView tv_auxiliaire;

        public DataViewHolder(View itemView) {
                super(itemView);
                tv_principal = (TextView) itemView.findViewById(R.id.tv_principal);
                tv_auxiliaire = (TextView) itemView.findViewById(R.id.tv_auxiliaire);
            }
        }
}

