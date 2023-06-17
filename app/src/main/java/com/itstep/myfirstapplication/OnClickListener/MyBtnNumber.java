package com.itstep.myfirstapplication.OnClickListener;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.itstep.myfirstapplication.R;

public class MyBtnNumber implements View.OnClickListener
{
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Click: " + ((Button) view).getText(), Toast.LENGTH_SHORT).show();

        // Поведение по нажатию в зависимости от id кнопки
        switch (view.getId()){
            case R.id.btnToClick:
                break;
            case R.id.button_first:
                break;
        }
    }
}
