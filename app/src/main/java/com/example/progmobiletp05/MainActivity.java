package com.example.progmobiletp05;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new RecyclerViewAdapter(this, getDataSource());
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<Data> getDataSource() {
        ArrayList results = new ArrayList<Data>();
        results.add(new Data(getString(R.string.mercure),getString(R.string.mercuredesc), R.drawable.mercure));
        results.add(new Data(getString(R.string.venus),getString(R.string.venusdesc), R.drawable.venus));
        results.add(new Data(getString(R.string.terre),getString(R.string.terredesc), R.drawable.terre));
        results.add(new Data(getString(R.string.mars),getString(R.string.marsdesc), R.drawable.mars));
        results.add(new Data(getString(R.string.jupiter),getString(R.string.jupiterdesc), R.drawable.jupiter));
        results.add(new Data(getString(R.string.saturne),getString(R.string.saturnedesc), R.drawable.saturne));
        results.add(new Data(getString(R.string.uranus),getString(R.string.uranusdesc), R.drawable.uranus));
        results.add(new Data(getString(R.string.neptune),getString(R.string.neptunedesc), R.drawable.neptune));
        return results;
    }
}