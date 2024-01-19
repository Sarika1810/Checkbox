package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b;
    CheckBox c1, c2, c3, c4, c5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        c1 = (CheckBox) findViewById(R.id.cb1);
        c2 = (CheckBox) findViewById(R.id.cb2);
        c3 = (CheckBox) findViewById(R.id.cb3);
        c4 = (CheckBox) findViewById(R.id.cb4);
        c5 = (CheckBox) findViewById(R.id.cb5);
        b = (Button) findViewById(R.id.btn);
        b.setOnClickListener(v -> {
            String result = "Selected Course:                ";
            if (c1.isChecked()) {
                result += "MAD";
              //  Toast.makeText(getApplicationContext(),"MAD", Toast.LENGTH_SHORT).show();
            }
           if (c2.isChecked()) {
                result += "\ncpp";
                //Toast.makeText(getApplicationContext(),"CPP", Toast.LENGTH_SHORT).show();
            }
           if (c3.isChecked()) {
                result += "php";
                //Toast.makeText(getApplicationContext(),"PWP", Toast.LENGTH_SHORT).show();
            }
           if (c4.isChecked()) {
              result += "pwp";
               // Toast.makeText(getApplicationContext(),"PWP", Toast.LENGTH_SHORT).show();
            }
           if (c5.isChecked()) {
               result += "ETI";
                //Toast.makeText(getApplicationContext(),"PWP", Toast.LENGTH_SHORT).show();
            }
           Toast.makeText(getApplicationContext(),result, Toast.LENGTH_LONG).show();

        });

    }


    }
