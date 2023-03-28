package com.week2.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    EditText number1Txt;
    EditText number2Txt;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         number1Txt=findViewById(R.id.number1Txt);
         number2Txt=findViewById(R.id.number2Txt);

         resultTxt=findViewById(R.id.resultTxt);


    }

    public void sum(View view){
            if (number1Txt.getText().toString().matches("")||number2Txt.getText().toString().matches(""))
            {
                resultTxt.setText("Enter Number!");

            }
            else {
                int number1 = Integer.parseInt(number1Txt.getText().toString());
                int number2 = Integer.parseInt(number2Txt.getText().toString());
                int result = number1 + number2;


                resultTxt.setText("Result: "+ result);
            }





    }
    public void sub(View view){
        if (number1Txt.getText().toString().matches("")||number2Txt.getText().toString().matches(""))
        {
            resultTxt.setText("Enter Number!");

        }
        else {
            int number1 = Integer.parseInt(number1Txt.getText().toString());
            int number2 = Integer.parseInt(number2Txt.getText().toString());
            int result = number1 - number2;


            resultTxt.setText("Result: "+ result);
        }

    }
    public void mult(View view){
        if (number1Txt.getText().toString().matches("")||number2Txt.getText().toString().matches(""))
        {
            resultTxt.setText("Enter Number!");

        }
        else {
            int number1 = Integer.parseInt(number1Txt.getText().toString());
            int number2 = Integer.parseInt(number2Txt.getText().toString());
            int result = number1 * number2;


            resultTxt.setText("Result: "+ result);
        }

    }
    public void div(View view){
        if (number1Txt.getText().toString().matches("")||number2Txt.getText().toString().matches(""))
        {
            resultTxt.setText("Enter Number!");

        }
        else {
            double number1 = Integer.parseInt(number1Txt.getText().toString());
            double number2 = Integer.parseInt(number2Txt.getText().toString());
            double result = number1 / number2;


            resultTxt.setText("Result: "+ result);
        }

    }
}