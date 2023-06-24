package com.itstep.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.itstep.myfirstapplication.adapters.ProfileAdapter;
import com.itstep.myfirstapplication.models.Profile;

import java.util.ArrayList;

public class MainActivityProfile extends AppCompatActivity {

    ProfileAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_profile);

        adapter = new ProfileAdapter(this, new ArrayList<Profile>());

        ((ListView) findViewById(R.id.lstProfiles)).setAdapter(adapter);

        ((Button) findViewById(R.id.btnAddProfile)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.getProfiles().add(new Profile("Addon"));
                adapter.notifyDataSetChanged();
            }
        });



    }

}