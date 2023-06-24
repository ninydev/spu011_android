package com.itstep.myfirstapplication.models;

import androidx.annotation.NonNull;

import java.util.UUID;

public class City {
    UUID id = new UUID(10, 200);
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return "{" + id + "}\n" + this.getName();
    }

    public String getId() {
        return id.toString();
    }
}
