package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double firstnum=0;
    double secondnum=0;
    double result;
    String operation;
    String isNumber;
    String Enternumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView ansScreen = findViewById(R.id.ansScreen);
        final TextView calscreen = findViewById(R.id.calScreen);
        final Button num0 =  findViewById(R.id.num0);
        final Button num1 =  findViewById(R.id.num1);
        final Button num2 =  findViewById(R.id.num2);
        final Button num3 =  findViewById(R.id.num3);
        final Button num4 =  findViewById(R.id.num4);
        final Button num5 =  findViewById(R.id.num5);
        final Button num6 =  findViewById(R.id.num6);
        final Button num7 =  findViewById(R.id.num7);
        final Button num8 =  findViewById(R.id.num8);
        final Button num9 =  findViewById(R.id.num9);
        final Button division =  findViewById(R.id.division);
        final Button multiply =  findViewById(R.id.multiply);
        final Button minus =  findViewById(R.id.minus);
        final Button plus =  findViewById(R.id.plus);
        final Button dot =  findViewById(R.id.dot);
        final Button equal =  findViewById(R.id.equal);
        final Button plusNegative = findViewById(R.id.plusNegative);
        final Button percent = findViewById(R.id.percent);

        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();
                switch (id) {
                    case R.id.num0:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num0.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.num1:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num1.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.num2:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num2.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.num3:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num3.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.num4:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num4.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.num5:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num5.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.num6:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num6.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.num7:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num7.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.num8:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num8.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.num9:
                        if(isNumber == "x"){
                            calscreen.setText("");
                            isNumber = "";
                        }
                        Enternumber  = calscreen.getText().toString() + num9.getText();
                        calscreen.setText(Enternumber);
                        break;

                    case R.id.division:
                        firstnum  = Double.parseDouble(calscreen.getText().toString());
                        calscreen.setText("");
                        operation = "/";
                        ansScreen.setText(firstnum+"/");
                        break;

                    case R.id.multiply:
                        firstnum  = Double.parseDouble(calscreen.getText().toString());
                        calscreen.setText("");
                        operation = "*";
                        ansScreen.setText(firstnum+"*");
                        break;

                    case R.id.minus:
                        firstnum  = Double.parseDouble(calscreen.getText().toString());
                        calscreen.setText("");
                        operation = "-";
                        ansScreen.setText(firstnum+"-");
                        break;

                    case R.id.plus:
                        firstnum  = Double.parseDouble(calscreen.getText().toString());
                        calscreen.setText("");
                        operation = "+";
                        ansScreen.setText(firstnum+"+");
                        break;

                    case R.id.dot:
                        if(!calscreen.getText().toString().contains(".")) {
                            Enternumber = calscreen.getText().toString() + dot.getText();
                            calscreen.setText(Enternumber);
                        }
                        break;

                    case R.id.equal:
                        String answer;
                        secondnum =  Double.parseDouble(calscreen.getText().toString());
                        if (operation == "+")
                        {
                            result = firstnum+secondnum;
                            answer = String.format("%.0f",result);
                            calscreen.setText(answer);
                            ansScreen.setText("");
                        }

                        else if (operation == "-")
                        {
                            result = firstnum-secondnum;
                            answer = String.format("%.0f",result);
                            calscreen.setText(answer);
                            ansScreen.setText("");
                        }

                        else if (operation == "*")
                        {
                            result = firstnum*secondnum;
                            answer = String.format("%.0f",result);
                            calscreen.setText(answer);
                            ansScreen.setText("");
                        }
                        else if (operation == "/")
                        {
                            result = firstnum/secondnum;
                            answer = String.format("%.0f",result);
                            calscreen.setText(answer);
                            ansScreen.setText("");
                        }
                        if (operation != ""){
                            isNumber = "x";
                        }

                        break;

                }
            }
        };
        num0.setOnClickListener(calculatorListener);
        num1.setOnClickListener(calculatorListener);
        num2.setOnClickListener(calculatorListener);
        num3.setOnClickListener(calculatorListener);
        num4.setOnClickListener(calculatorListener);
        num5.setOnClickListener(calculatorListener);
        num6.setOnClickListener(calculatorListener);
        num7.setOnClickListener(calculatorListener);
        num8.setOnClickListener(calculatorListener);
        num9.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        multiply.setOnClickListener(calculatorListener);
        minus.setOnClickListener(calculatorListener);
        plus.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equal.setOnClickListener(calculatorListener);
        plusNegative.setOnClickListener(calculatorListener);
        percent.setOnClickListener(calculatorListener);

        final Button back = findViewById(R.id.delete);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayedElements = calscreen.getText().toString();
                int length = displayedElements.length();
                if(length>0){
                    displayedElements = displayedElements.substring(0,length-1);
                    calscreen.setText(displayedElements);
                }

            }
        });

        final Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calscreen.setText("");
                ansScreen.setText("");
            }
        });

    }
}

