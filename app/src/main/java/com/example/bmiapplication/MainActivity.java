package com.example.bmiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText inputBerat;
    EditText inputTinggi;
    TextView hasil;
    //declare global variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputBerat = findViewById(R.id.inputBerat);
        inputTinggi = findViewById(R.id.inputTinggi);
        hasil = findViewById(R.id.hasil);
    }
    //find the input

    public void HitungBMI(View view) {
        double berat = Double.parseDouble(inputBerat.getText().toString());
        double tinggi = Double.parseDouble(inputTinggi.getText().toString());
        double hasilBMI = berat / (tinggi * tinggi);

        if(hasilBMI < 18.5){
            hasil.setText(hasilBMI + "Kekurangan Berat Badan");
        }
        else if(hasilBMI <= 24.9){
            hasil.setText(hasilBMI + "Normal (Ideal)");
        }
        else if(hasilBMI <= 29.9){
            hasil.setText(hasilBMI + "Kelebihan Berat Badan");
        }
        else{
            hasil.setText(hasilBMI + "Kegemukan (Obesitas)");
        }

    }
    //count the input for the output
}