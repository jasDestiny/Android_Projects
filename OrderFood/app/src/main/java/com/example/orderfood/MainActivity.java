package com.example.orderfood;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    public EditText e1, e2, e3, e4, e5, e6;


    public void Purchase(View view){
        HashMap<String, Integer> prices=new HashMap<String, Integer>();
        HashMap<String, Integer> quantity=new HashMap<String, Integer>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName2);
        e3=findViewById(R.id.editTextTextPersonName3);
        e4=findViewById(R.id.editTextTextPersonName4);
        e5=findViewById(R.id.editTextTextPersonName5);
        e6=findViewById(R.id.editTextTextPersonName6);

    }
}