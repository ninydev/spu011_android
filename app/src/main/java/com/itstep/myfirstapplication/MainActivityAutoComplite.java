package com.itstep.myfirstapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivityAutoComplite extends AppCompatActivity {

    String[] cities = {"Odesa", "Mykolaiv", "Kyiv"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_auto_complite);

        AutoCompleteTextView in = findViewById(R.id.inACities);
        in.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, cities));


    }
}