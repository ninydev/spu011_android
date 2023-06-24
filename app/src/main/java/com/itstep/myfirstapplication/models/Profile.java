package com.itstep.myfirstapplication.models;

import androidx.annotation.NonNull;

import java.util.UUID;

public class Profile {

    /**
     * Динамическое поле, полученное при построении базы данных
     */
    boolean isFriend = false;
    public boolean isFriend() { return isFriend;}
    public void setIsFriend(boolean b) { isFriend = b;}


    public Profile(String name) {
        this.name = name;
    }

    UUID id = new UUID(10, 200);

    public String getId() {
        return id.toString();
    }


    private String name;

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


}
