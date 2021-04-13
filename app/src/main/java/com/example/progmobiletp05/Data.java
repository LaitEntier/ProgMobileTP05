package com.example.progmobiletp05;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class Data {
    private String principal;
    private String auxiliaire;

    Data (String prin, String aux){
        principal = prin;
        auxiliaire = aux;
    }

    public String getPrincipal() {
        return principal;
    }

    public String getAuxiliaire() {
        return auxiliaire;
    }


}