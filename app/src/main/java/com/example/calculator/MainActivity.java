package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView input, output;
    int data1, data2;
    boolean substract,multiply,add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input = findViewById(R.id.display);
        output = findViewById(R.id.result);
    }


    private void calculations(String value) {
        input.setText(input.getText() + value);
    }


    public void num7(View view) {
        calculations("7");
    }

    public void num8(View view) {
        calculations("8");
    }

    public void num9(View view) {
        calculations("9");
    }

    public void cancelbtn(View view) {
        input.setText("");

        output.setText("");
    }

    public void num4(View view) {
        calculations("4");
    }

    public void num5(View view) {
        calculations("5");
    }

    public void num6(View view) {
        calculations("6");
    }

    public void num0(View view) {
        calculations("0");
    }


    public void num1(View view) {
        calculations("1");
    }

    public void num2(View view) {
        calculations("2");
    }

    public void num3(View view) {
        calculations("3");
    }

    public void addition(View view) {
        data1 = Integer.parseInt(input.getText() + "");
        add = true;
        input.setText("");
    }

    public void minus(View view) {
        data1 = Integer.parseInt(input.getText() + "");
        substract = true;
        input.setText("");
    }

    public void multiplication(View view) {
        data1 = Integer.parseInt(input.getText() + "");
        multiply = true;
        input.setText("");
    }


    public void dot(View view) {
    }

    public void equal(View view) {
        data2 = Integer.parseInt(input.getText() + "");

if(substract == true){
    output.setText(data1 - data2 + "");
    Intent intent = new Intent();

}

        if(multiply == true){
            output.setText(data1 * data2 + "");
        }

        if(add == true){
            output.setText(data1 + data2 + "");
        }
    }



    public void divide(View view) {
    }
}