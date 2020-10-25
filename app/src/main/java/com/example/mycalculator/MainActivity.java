package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText input;
    Button add,sub,mul,div,clr,equals;
    double firstNumber,secondNumber;
    double result;
    String op;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input= findViewById(R.id.userInput);
        add= findViewById(R.id.btnAdd);
        sub=findViewById(R.id.btnSub);
        mul =findViewById(R.id.btnMul);
        div= findViewById(R.id.btnDiv);
        clr= findViewById(R.id.btnClr);
        equals= findViewById(R.id.btnEquals);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumber = Double.parseDouble(input.getText().toString());
                input.setText("");
                op ="+";
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumber = Double.parseDouble(input.getText().toString());
                input.setText("");
                op ="-";
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumber = Double.parseDouble(input.getText().toString());
                input.setText("");
                op ="*";
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                firstNumber = Double.parseDouble(input.getText().toString());
                input.setText("");
                op ="/";
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                input.setText("");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondNumber = Double.parseDouble(input.getText().toString());
                input.setText("");
                if(op.equals("+")){
                    input.setText(Double.toString(firstNumber + secondNumber));
                }else if(op.equals("-")){
                    input.setText(Double.toString(firstNumber - secondNumber));
                }else if(op.equals("*")){
                    input.setText(Double.toString(firstNumber * secondNumber));
                }else{
                    if(secondNumber==0){
                        input.setText("Wrong");
                    }else{
                        input.setText(Double.toString(firstNumber / secondNumber));
                    }
                }
            }
        });
    }
}