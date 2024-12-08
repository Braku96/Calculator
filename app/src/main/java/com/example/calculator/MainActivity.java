package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText number1Text;
    EditText number2Text;
    TextView Result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Alanlara tanımlanan idler bu bölümde tanımlanarak eşitlendi.

        number1Text = findViewById(R.id.Number1);
        number2Text = findViewById(R.id.Number2);
        Result = findViewById(R.id.Result);


    }

    public void toplama(View view){

        if (number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){

            Result.setText("Sayı gir la");

        }else {
        int Number1 = Integer.parseInt(number1Text.getText().toString());
        int Number2 = Integer.parseInt(number2Text.getText().toString());

        int Sonuc = Number1 + Number2;

        Result.setText("Sonuc : " + Sonuc);}

    }

    public void cikarma(View view) {
        if (number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){

            Result.setText("Sayı gir la");

        }else {
        int Number1 = Integer.parseInt(number1Text.getText().toString());
        int Number2 = Integer.parseInt(number2Text.getText().toString());

        int Sonuc = Number1 - Number2;

        Result.setText("Sonuc : " + Sonuc);}
    }
    public void carpma(View view){

        if (number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){

            Result.setText("Sayı gir la");

        }else {
        int Number1 = Integer.parseInt(number1Text.getText().toString());
        int Number2 = Integer.parseInt(number2Text.getText().toString());

        int Sonuc = Number1 * Number2;

        Result.setText("Sonuc : " + Sonuc);}
    }
    public void bolme(View view){

        if (number1Text.getText().toString().matches("")|| number2Text.getText().toString().matches("")){

            Result.setText("Sayı gir la");

        }else {
        int Number1 = Integer.parseInt(number1Text.getText().toString());
        int Number2 = Integer.parseInt(number2Text.getText().toString());

        int Sonuc = Number1 / Number2;

        Result.setText("Sonuc : " + Sonuc);}

    }

}