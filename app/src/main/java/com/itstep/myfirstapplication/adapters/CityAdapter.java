package com.itstep.myfirstapplication.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.itstep.myfirstapplication.R;
import com.itstep.myfirstapplication.models.City;

import java.util.ArrayList;

public class CityAdapter extends ArrayAdapter<City>
{
    // Сохраним парамтеры для построения элементов
    Context context;
    int resource;


    /**
     * Коллекция элементов - есть хорошая идея - вообще
     * перенести хранение коллекций в соответствующие адаптеры
     */
    ArrayList<City> cities;

    public CityAdapter(@NonNull Context context, int resource, ArrayList<City> cities) {
        super(context, resource, cities);
        this.context = context;
        this.resource = resource;
        this.cities = cities;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Получим данные модели (в зависимости от позиции, которую сейчас строим)
        City model = cities.get(position);

        // Полуим экземпляр верстки на основе родительского элемента
        @SuppressLint("ViewHolder") View view = LayoutInflater.from(context).inflate(this.resource, parent, false);

        // Назначим данные на элементы внутри верстки
        ((TextView)view.findViewById(R.id.cityId)).setText(model.getId());
        ((TextView)view.findViewById(R.id.cityName)).setText(model.getName());

        return view;
        //return super.getView(position, convertView, parent);
    }
}
