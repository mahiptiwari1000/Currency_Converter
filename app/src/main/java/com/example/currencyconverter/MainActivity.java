package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view){

        EditText edit = (EditText) findViewById(R.id.editText);
        String edit1 = edit.getText().toString();
        Double edit2 = Double.parseDouble(edit1);
        Double edit3 = 75.50*edit2;
        String edit4 = String.format("%.2f",edit3);
        Toast.makeText(this,"$"+edit1+" is "+" INR "+edit4,Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
