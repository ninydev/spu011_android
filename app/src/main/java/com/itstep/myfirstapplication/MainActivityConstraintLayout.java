package com.itstep.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.itstep.myfirstapplication.OnClickListener.MyBtnNumber;

public class MainActivityConstraintLayout extends AppCompatActivity {

    int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_constraint_layout);

        findViewById(R.id.btnToClick).setOnClickListener(new MyBtnNumber());

    }
}