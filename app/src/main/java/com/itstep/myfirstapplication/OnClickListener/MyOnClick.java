package com.itstep.myfirstapplication.OnClickListener;

import android.view.View;
import android.widget.Toast;

public class MyOnClick implements View.OnClickListener
{
    @Override
    public void onClick(View view) {
        Toast.makeText(view.getContext(), "Click", Toast.LENGTH_LONG).show();
    }
}
