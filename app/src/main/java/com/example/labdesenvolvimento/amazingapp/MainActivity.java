package com.example.labdesenvolvimento.amazingapp;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exibir(View v) {
        EditText editFrase = (EditText) findViewById(R.id.editFrase);
        TextView textFrase = (TextView) findViewById(R.id.textFrase);

        String str = editFrase.getText().toString();
        textFrase.setText(str);
        textFrase.setTextColor(getColor(R.color.vermelho));
    }

    public void  maiorMenor(View v) {
        EditText num1 = (EditText) findViewById(R.id.number1);
        EditText num2 = (EditText) findViewById(R.id.number2);

        TextView textResult = (TextView) findViewById(R.id.textResult);

        int numero1 = Integer.parseInt(num1.getText().toString());
        int numero2 = Integer.parseInt(num2.getText().toString());
        String msg1 = "Numero 1 maior";
        String msg2 = "Numero 2 maior";

        if(numero1 > numero2) {
            textResult.setText(msg1);
            textResult.setTextColor(getColor(R.color.verde));
        } else {
            textResult.setText(msg2);
            textResult.setTextColor(getColor(R.color.vermelho));
        }
    }

}