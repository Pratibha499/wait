package com.example.wait;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    EditText etNumber;
    TextView tvAns;
    Button Factorial,Square,Cube,SquareRoot,CubeRoot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber = findViewById(R.id.etNumber);
        tvAns = findViewById(R.id.tvAnswer);
        Factorial = findViewById(R.id.btnfactorial);
        Square = findViewById(R.id.btnSquare);
        Cube = findViewById(R.id.btnCube);
        SquareRoot = findViewById(R.id.btnSquareRoot);
        CubeRoot = findViewById(R.id.btnCubeRoot);
        Factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number;
                Number = Integer.parseInt(etNumber.getText().toString());
                tvAns.setText("Factorial is = " + Math.round(factorial(((Number)))));
            }
        });

        Square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number, ans;
                Number = Integer.parseInt(etNumber.getText().toString());
                ans = Number * Number;
                tvAns.setText("Square is = " + ans);
            }
        });

        Cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int Number, ans;
                Number = Integer.parseInt(etNumber.getText().toString());
                ans = Number * Number * Number;
                tvAns.setText("Cube is = " + ans);
            }
        });

        SquareRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Number, ans;
                Number = Integer.parseInt(etNumber.getText().toString());
                ans =(float) Math.sqrt(Number);
                tvAns.setText("Cube is = " + ans);
            }
        });

        CubeRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double Number, ans;
                Number = Integer.parseInt(etNumber.getText().toString());
                ans = (float) Math.cbrt(Number);
                tvAns.setText("CubeRoot is = " + ans);
            }
        });

    }

    private double factorial ( double num){
            if (num < 2) {
                return 1;
            } else {
                return num * factorial(num - 1);
            }
        }


    }
