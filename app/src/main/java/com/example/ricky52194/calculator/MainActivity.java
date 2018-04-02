package com.example.ricky52194.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button clear;
    private Button clearEntry;
    private Button equals;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private Button plusMinus;
    private Button decimal;

    private double value1 = 0, value2 = 0, result = 0;
    private boolean add = false, sub = false, mult = false, div = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = findViewById(R.id.display);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide =  findViewById(R.id.divide);
        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        equals = findViewById(R.id.equals);
        plusMinus = findViewById(R.id.plusMinus);
        decimal = findViewById(R.id.decimal);
        clear = findViewById(R.id.clear);
        clearEntry = findViewById(R.id.clearEntry);

        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                str += "0";
                display.setText(str);
            }
        });

        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals("0")){
                    display.setText("1");
                }else{
                    str += "1";
                    display.setText(str);
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals("0")){
                    display.setText("2");
                }else{
                    str += "2";
                    display.setText(str);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals("0")){
                    display.setText("3");
                }else{
                    str += "3";
                    display.setText(str);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals("0")){
                    display.setText("4");
                }else{
                    str += "4";
                    display.setText(str);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals("0")){
                    display.setText("5");
                }else{
                    str += "5";
                    display.setText(str);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals("0")){
                    display.setText("6");
                }else{
                    str += "6";
                    display.setText(str);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals("0")){
                    display.setText("7");
                }else{
                    str += "7";
                    display.setText(str);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals("0")){
                    display.setText("8");
                }else{
                    str += "8";
                    display.setText(str);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals("0")){
                    display.setText("9");
                }else{
                    str += "9";
                    display.setText(str);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                value1 = 0;
                value2 = 0;
                result = 0;
                display.setText("0");
            }
        });

        clearEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display.setText("");
            }
        });

        decimal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                str = str + ".";
                display.setText(str);
            }
        });
        plusMinus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                double value = Double.parseDouble(display.getText().toString());
                value *= -1;
                display.setText(Double.toString(value));
            }
        });
        plus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                value1 = Double.parseDouble(display.getText().toString());
                display.setText("");
                add = true;
            }
        });
        minus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                value1 = Double.parseDouble(display.getText().toString());
                display.setText("");
                sub = true;
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Double.parseDouble(display.getText().toString());
                display.setText("");
                mult = true;
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 = Double.parseDouble(display.getText().toString());
                display.setText("");
                div = true;
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Double.parseDouble(display.getText().toString());
                if(add){
                    result = value1 + value2;

                    display.setText(Double.toString(result));
                    add = false;
                }else if(sub){
                    result = value1 - value2;
                    display.setText(Double.toString(result));
                    sub = false;
                }else if(mult){
                    result = value1 * value2;
                    display.setText(Double.toString(result));
                    mult = false;
                }else{
                    result = value1 / value2;
                    display.setText(Double.toString(result));
                    div = false;
                }
            }
        });
    }

}
