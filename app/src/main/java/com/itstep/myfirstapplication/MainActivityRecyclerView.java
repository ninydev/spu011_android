package com.itstep.myfirstapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class MainActivityRecyclerView extends AppCompatActivity {

    String[] cities = {"Odesa", "Mykolaiv", "Kyiv"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_recycler_view);

        RecyclerView recyclerView = findViewById(R.id.MyRcView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        RecyclerView.Adapter<ViewHolder> adapter = new RecyclerView.Adapter<ViewHolder>() {
            @NonNull
            @Override
            public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_city, parent, false);
                return new ViewHolder(view);
            }

            @Override
            public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
                String city = cities[position];
                holder.cityTextView.setText(city);
            }

            @Override
            public int getItemCount() {
                return cities.length;
            }
        };

        recyclerView.setAdapter(adapter);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView cityTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            cityTextView = itemView.findViewById(R.id.cityTextView);
        }
    }
}