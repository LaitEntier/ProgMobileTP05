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

public class MainActivity extends AppCompatActivity implements RecyclerClickListener {
    private RecyclerView mRecyclerView;
    private RecyclerViewAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    CoordinatorLayout mcoordinatorLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        ((GridLayoutManager) mLayoutManager).setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                    @Override
                    public int getSpanSize(int positionVue) {
                        return (positionVue % 3) == 0 ? 2 : 1;
                    }
                });
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new RecyclerViewAdapter(getDataSource());
        mRecyclerView.setAdapter(mAdapter);

//        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(this, R.drawable.divider);
//        mRecyclerView.addItemDecoration(itemDecoration);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mAdapter.setRecyclerClickListener((RecyclerClickListener) this);
    }

    public void onClickRecyclerItem(int position, View v) {
        mcoordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);
        Snackbar.make(mcoordinatorLayout, " Clic sur l'item " + position, Snackbar.LENGTH_LONG).show();
    }

    private ArrayList<Data> getDataSource() {
        ArrayList results = new ArrayList<Data>();
        for (int index = 0; index < 20; index++) {
            Data obj = new Data("Texte principal " + index, "Texte auxiliaire " + index);
            results.add(index, obj);
        }
        return results;
    }
}