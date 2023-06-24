package com.itstep.myfirstapplication.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.itstep.myfirstapplication.R;
import com.itstep.myfirstapplication.models.City;
import com.itstep.myfirstapplication.models.Profile;

import java.util.ArrayList;

public class ProfileAdapter extends ArrayAdapter<Profile>
{
    Context context;
    int resource;

    ArrayList<Profile> profiles;

    /**
     * Для операций вне адаптера (например создания еще профиля)
     */
    public ArrayList<Profile> getProfiles() {
        return profiles;
    }

    /**
     * первоначальное наполнение данными
     */
    protected void seed(){
        profiles.add(new Profile("Sasha"));
        profiles.add(new Profile("Masha"));
        profiles.add(new Profile("Petye"));
        notifyDataSetChanged();
    }

    public ProfileAdapter(@NonNull Context context, ArrayList<Profile> profiles) {
        super(context, R.layout.profile_list_item, profiles );
        Log.d("profile", "start");
        this.context = context;
        this.profiles = profiles;
        this.resource = R.layout.profile_list_item;
        seed();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Получим данные модели (в зависимости от позиции, которую сейчас строим)
        Profile model = profiles.get(position);

        @SuppressLint("ViewHolder") View view = LayoutInflater.from(context).inflate(this.resource, parent, false);

        // Вывели имя
        ((TextView)view.findViewById(R.id.profileName)).setText(model.getName());

        ToggleButton btn = view.findViewById(R.id.toggleFriend);
        btn.setChecked(model.isFriend());

        btn.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Обновление значения isFriend в модели на основе состояния кнопки
                model.setIsFriend(isChecked);
                Toast.makeText(buttonView.getContext(), "Change to: " + model.isFriend(), Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }


}


