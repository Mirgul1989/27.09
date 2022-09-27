package com.example.a2709;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String oldNumber;
    String operator;
    private TextView textView;
    private Integer zero, first, second, third, fourth, fifth, sixth, seventh, eighth, ninth;
    private Boolean isNew = true;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text_view);

    }

    public void onNumberClick(View view) {
        if (isNew)
            textView.setText("");
        isNew = false;
        String number = textView.getText().toString();
        switch (view.getId()) {
            case R.id.btn_one:
                number = number + "1";
                break;
            case R.id.btn_two:
                number = number + "2";
                break;
            case R.id.three:
                number = number + "3";
                break;
            case R.id.four:
                number = number + "4";
                break;
            case R.id.five:
                number = number + "5";
                break;
            case R.id.six:
                number = number + "6";
                break;
            case R.id.seven:
                number = number + "7";
                break;
            case R.id.eight:
                number = number + "8";
                break;
            case R.id.nine:
                number = number + "9";
                break;
            case R.id.zero:
                number = number + "0";
                break;
            case R.id.tochka:
                number = number + ".";
                break;
            case R.id.btn_plus_minus:
                number = "-" + number;
                break;

        }

        textView.setText(number);


    }

    public void onOperationClick(View view) {
        isNew = true;
        oldNumber = textView.getText().toString();
        switch (view.getId()) {
            case R.id.btn_plus:
                operator = "+";
                break;
            case R.id.btn_minus:
                operator = "-";
                break;
            case R.id.delenie:
                operator = "/";
                break;
            case R.id.btn_umnojenie:
                operator = "*";
                break;
        }


    }

    public void onClickEqual(View view) {
        String newNumber = textView.getText().toString();
        double result = 0.0;
        switch (operator) {
            case "+":
                result = Double.parseDouble(oldNumber) + Double.parseDouble(newNumber);
                break;
            case "-":
                result = Double.parseDouble(oldNumber) - Double.parseDouble(newNumber);
                break;
            case "/":
                result = Double.parseDouble(oldNumber) / Double.parseDouble(newNumber);
                break;
            case "*":
                result = Double.parseDouble(oldNumber) * Double.parseDouble(newNumber);
                break;
        }
        textView.setText(result + "");

        //test
    }

    public void acClick(View view) {
        textView.setText("0");
        isNew = true;
    }
}