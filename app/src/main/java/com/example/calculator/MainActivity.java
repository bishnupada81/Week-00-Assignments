package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView textView1;
    TextView textView2;
    float ValueOne, ValueTwo;

    boolean Add, Sub, Mul,Div,Per;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.tv_one);
        textView2 = findViewById(R.id.tv_tow);

    }

    public void All_clear(View view) {
        textView1.setText("");
        textView2.setText("");
    }

    public void Delete(View view) {
        String str;
        str= textView1.getText().toString();
        int len=str.length();
        if(len>0)
        {
            str=str.substring(0,len-1);
            textView1.setText(str);
        }
    }

    public void Seven(View view) {

        textView1.setText(textView1.getText() + "7");
    }

    public void Eight(View view) {

        textView1.setText(textView1.getText() + "8");
    }

    public void Nine(View view) {

        textView1.setText(textView1.getText() + "9");
    }
    public void Four(View view) {

        textView1.setText(textView1.getText() + "4");
    }

    public void Five(View view) {

        textView1.setText(textView1.getText() + "5");
    }

    public void Six(View view) {

        textView1.setText(textView1.getText() + "6");
    }

    public void One(View view) {

        textView1.setText(textView1.getText() + "1");
    }

    public void Tow(View view) {

        textView1.setText(textView1.getText() + "2");
    }

    public void Three(View view) {

        textView1.setText(textView1.getText() + "3");
    }

    public void Zero(View view) {

        textView1.setText(textView1.getText() + "0");
    }

    public void Dot(View view) {

        textView1.setText(textView1.getText() + ".");
    }

    public void Addition(View view) {

        if (textView1 == null) {
            textView1.setText("");
        } else {
            ValueOne = Float.parseFloat(textView1.getText() + "");
            Add = true;
            textView1.setText(null);
        }
    }

    public void Persent(View view) {
            ValueOne = Float.parseFloat(textView1.getText() + "");
            Per = true;
            textView1.setText(null);
    }

    public void Multiplication(View view) {
            ValueOne = Float.parseFloat(textView1.getText() + "");
            Mul = true;
            textView1.setText(null);
    }

    public void Subtraction(View view) {

            ValueOne = Float.parseFloat(textView1.getText() + "");
            Sub = true;
            textView1.setText(null);
    }

    public void Divition(View view) {
            ValueOne = Float.parseFloat(textView1.getText() + "");
            Div = true;
            textView1.setText(null);
    }

    public void Equel(View view) {
        ValueTwo = Float.parseFloat(textView1.getText() + "");

        if (Add == true) {

                textView1.setText(ValueOne + "+" + ValueTwo);
                textView2.setText(ValueOne + ValueTwo + "");
                Add = false;
            }

        if(Per == true){

            textView1.setText(ValueOne + "%" + ValueTwo);
            textView2.setText(ValueOne % ValueTwo + "");
            Add = false;
        }

        if(Mul == true){

            textView1.setText(ValueOne + "*" + ValueTwo);
            textView2.setText(ValueOne * ValueTwo + "");
            Mul = false;
        }

        if(Sub == true){

            textView1.setText(ValueOne + "-" + ValueTwo);
            textView2.setText(ValueOne - ValueTwo + "");
            Sub = false;
        }
        if(Div == true){

            textView1.setText(ValueOne + "/" + ValueTwo);
            textView2.setText(ValueOne / ValueTwo + "");
            Div = false;
        }

    }

}

