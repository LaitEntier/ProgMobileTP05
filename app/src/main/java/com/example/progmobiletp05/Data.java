package com.example.progmobiletp05;

public class Data {
    private String name;
    private String description;
    private int image;

    Data (String name, String description, int image){
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }

}