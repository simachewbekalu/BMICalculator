package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bmicalculator.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView result = findViewById(R.id.bmi);
        TextInputEditText height= findViewById(R.id.hid);
        TextInputEditText weight = findViewById(R.id.wid);
        Button calc= findViewById(R.id.btn1);
        Button reset = findViewById(R.id.btn2);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double h = Double.parseDouble(height.getText().toString());
                double w = Double.parseDouble(weight.getText().toString());
                double bmi=w/(h*h);
                result.setText(Double.toString(bmi));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                height.setText("");
                weight.setText("");
                result.setText("");
            }
        });
    }
}