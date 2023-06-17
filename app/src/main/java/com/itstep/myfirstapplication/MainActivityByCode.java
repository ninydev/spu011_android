package com.itstep.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.itstep.myfirstapplication.OnClickListener.MyOnClick;
import com.itstep.myfirstapplication.Watchers.MyTextWatcher;

public class MainActivityByCode extends AppCompatActivity {

    int txtViewId;
    EditText txtInput;

    int txtInputId;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Обратимся к констуктору предка
        super.onCreate(savedInstanceState);
        createElements();
    }


    /**
     * Процесс создания группы єлементов
     */
    void createElements(){
        // Создадим контейнер
        LinearLayout linearLayout = new LinearLayout(this);

        // горизонтальная ориентация
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        txtInput = new EditText(this);
        txtInputId = View.generateViewId();
        txtInput.setId(txtInputId);

        // Создадим программно элемент
        txtView = new TextView(this);

        // ПОручим андроиду создать Id для этого элемента и сохраним его в переменной
        txtViewId = View.generateViewId();
        // назначим созданный id на наш элемент
        txtView.setId(txtViewId);

        // создаем параметры позиционирования для элемента
        LinearLayout.LayoutParams layoutParamsInput = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // устанавливаем отступы
        layoutParamsInput.setMargins(100, 100, 0, 0);
        txtInput.setLayoutParams(layoutParamsInput);

        txtInput.addTextChangedListener(new MyTextWatcher(txtView, txtInput) );

        txtInput.setOnClickListener(new MyOnClick());

        linearLayout.addView(txtInput);










        //            // найдем элемент
//            TextView txtFindById = findViewById(myViewId);
//            txtFindById = findViewById(R.id.textView);

//        Log.d("Find_Id", "R.id.textView  = " + R.id.textView);
//        Log.d("Find_Id", "generateViewId = " + myViewId);
//        Log.d("Find_Id", "generateViewId = " + View.generateViewId());
//        Log.d("Find_Id", "generateViewId = " + View.generateViewId());
//        Log.d("Find_Id", "generateViewId = " + View.generateViewId());



        // Наполним его данными (относящимися к элементу)
        txtView.setText("Hello");
        txtView.setTextSize(30);

        // создаем параметры позиционирования для элемента
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        // устанавливаем отступы
        layoutParams.setMargins(100, 100, 0, 0);

        txtView.setLayoutParams(layoutParams);

        // добавляем элемент в LinearLayout
        linearLayout.addView(txtView);


        // Назначим созданный контейнер как отображение (как контент) для этого экрана
        setContentView(linearLayout);
    }
}