package com.example.progmobiletp05;

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