package com.itstep.myfirstapplication.OnClickListener;

import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.itstep.myfirstapplication.R;

public class MyBtnNumber implements View.OnClickListener
{
    @Override
    public void onClick(View view) {
        // makeText возвращает ссылку на созданный объект - и я могу сразу его вывести
        Toast.makeText(view.getContext(), "Click: " + ((Button) view).getText(), Toast.LENGTH_SHORT).show();

        // если мне нужно обратиться к другим полям объекта - я создам переменную и обращусь по ней
        Toast toast = Toast.makeText(view.getContext(), "Hello Android!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP, 0,160);   // import android.view.Gravity;
        toast.show();

        // Поведение по нажатию в зависимости от id кнопки
        switch (view.getId()){
            case R.id.btnToClick:
                break;
            case R.id.button_first:
                break;
        }
    }
}
