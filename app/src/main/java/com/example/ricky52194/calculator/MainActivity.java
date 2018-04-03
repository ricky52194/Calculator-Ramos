package com.example.ricky52194.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView display;
    private Button zero, one, two, three, four, five, six, seven, eight, nine, clear, clearEntry, equals, plus, minus, multiply, divide, plusMinus, decimal;
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

        display.setText(getString(R.string.zero));
        zero.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                str += getString(R.string.zero);
                display.setText(str);
            }
        });

        one.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals(getString(R.string.zero))){
                    display.setText(getString(R.string.one));
                }else{
                    str += getString(R.string.one);
                    display.setText(str);
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals(getString(R.string.zero))){
                    display.setText(getString(R.string.two));
                }else{
                    str += getString(R.string.two);
                    display.setText(str);
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals(getString(R.string.zero))){
                    display.setText(getString(R.string.three));
                }else{
                    str += getString(R.string.three);
                    display.setText(str);
                }
            }
        });
        four.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals(getString(R.string.zero))){
                    display.setText(getString(R.string.four));
                }else{
                    str += getString(R.string.four);
                    display.setText(str);
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals(getString(R.string.zero))){
                    display.setText(getString(R.string.five));
                }else{
                    str += getString(R.string.five);
                    display.setText(str);
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals(getString(R.string.zero))){
                    display.setText(getString(R.string.six));
                }else{
                    str += getString(R.string.six);
                    display.setText(str);
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals(getString(R.string.zero))){
                    display.setText(getString(R.string.seven));
                }else{
                    str += getString(R.string.seven);
                    display.setText(str);
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals(getString(R.string.zero))){
                    display.setText(getString(R.string.eight));
                }else{
                    str += getString(R.string.eight);
                    display.setText(str);
                }
            }
        });
        nine.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                String str = display.getText().toString();
                if(str.equals(getString(R.string.zero))){
                    display.setText(getString(R.string.nine));
                }else{
                    str += getString(R.string.nine);
                    display.setText(str);
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                value1 = 0;
                value2 = 0;
                result = 0;
                display.setText(getString(R.string.zero));
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
                str = str + getString(R.string.decimal);
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

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(getString(R.string.onScreenKey), display.getText().toString());
        outState.putDouble(getString(R.string.value1Key), value1);
        outState.putDouble(getString(R.string.value2Key), value2);
        outState.putDouble(getString(R.string.resultKey), result);
        outState.putBoolean(getString(R.string.addKey), add);
        outState.putBoolean(getString(R.string.subKey), sub);
        outState.putBoolean(getString(R.string.multKey), mult);
        outState.putBoolean(getString(R.string.divKey), div);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        display.setText(savedInstanceState.getString(getString(R.string.onScreenKey)));
        value1 = savedInstanceState.getDouble(getString(R.string.value1Key));
        value2 = savedInstanceState.getDouble(getString(R.string.value2Key));
        result = savedInstanceState.getDouble(getString(R.string.resultKey));
        add = savedInstanceState.getBoolean(getString(R.string.addKey));
        sub = savedInstanceState.getBoolean(getString(R.string.subKey));
        mult = savedInstanceState.getBoolean(getString(R.string.multKey));
        div = savedInstanceState.getBoolean(getString(R.string.divKey));
    }
}
