package com.itstep.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.itstep.myfirstapplication.adapters.CityAdapter;
import com.itstep.myfirstapplication.models.City;

import java.util.ArrayList;

public class MainActivityCities extends AppCompatActivity {

    String[] cities = {"Odesa", "Mykolaiv", "Kyiv"};

    ArrayList<City> citiesObj = new ArrayList<>();

    ListView lstCities;

    protected void buildObj() {
        citiesObj.add( new City("Odesa"));
        citiesObj.add( new City("Mykolaiv"));
        citiesObj.add( new City("Kyiv"));
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cities);
        lstCities = findViewById(R.id.lstCities);
        buildObj(); // Загрузим данные в массив
        myCityAdapter();
    }

    /**
     * Используем собственный адаптер
     */
    protected void myCityAdapter(){
        CityAdapter adapter = new CityAdapter(this, R.layout.city_list_item, citiesObj);
        lstCities.setAdapter(adapter);
    }

    /**
     * Построение списка из коллекции объектов
     */
    protected void setObj(){

        ArrayAdapter<City> adapter = new ArrayAdapter<>(
                this,                           // передаем контекст для работы
                android.R.layout.simple_list_item_1,   // передаем тип верстки каждого элемента
                citiesObj                              // передаем коллекцию
        );

        lstCities.setAdapter(adapter); // назначаем адаптер на элемент
    }

    /**
     * Построение списка из простой коллекции
     */
    protected void setPrimitive() {
        /**
         * Создадим адаптер, который позволит преобразовать
         * коллекцию к выводу внутри списка
         */
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,                           // передаем контекст для работы
                android.R.layout.simple_list_item_1,    // передаем тип верстки каждого элемента
                cities                                  // передаем коллекцию
        );

        lstCities.setAdapter(adapter); // назначаем адаптер на элемент
    }
}