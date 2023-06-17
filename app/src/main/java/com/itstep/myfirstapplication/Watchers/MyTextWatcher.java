package com.itstep.myfirstapplication.Watchers;

import android.app.Activity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MyTextWatcher implements TextWatcher
{
    TextView txtView;
    int txtViewId;

    EditText txtInput;
    int txtInputId;

    private Activity activity; // или Fragment, если применимо

    public MyTextWatcher(Activity activity) {
        this.activity = activity;
    }


    public MyTextWatcher(TextView txtView, EditText txtInput){
        this.txtView = txtView;
        this.txtInput = txtInput;
    }

    public MyTextWatcher(Activity activity, int txtViewId, int txtInputId){
        this.activity = activity;
        this.txtViewId = txtViewId;
        this.txtInputId = txtInputId;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        // Если я передал обработчкиу событий элементы - я обращаюсь к ним
        txtView.setText(txtInput.getText());

        // Если я передавал только id элементов, то мне нужно сначал их найти,
        // потом обратиться к ним как к определенному типу (что бы получить доступ
        // к методам и свойвтвам конкретного типа элемента
//        ((TextView) activity.findViewById(txtViewId)).setText(
//                ((EditText) activity.findViewById(txtInputId)).getText());
    }

    @Override
    public void afterTextChanged(Editable editable) {

    }
}
