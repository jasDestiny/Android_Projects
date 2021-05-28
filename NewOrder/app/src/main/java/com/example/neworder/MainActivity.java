package com.example.neworder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public EditText e1, e2, e3, e4, e5;

    public void Purchase(View view){
        HashMap<String, Integer> Prices = new HashMap<String, Integer>(5);
        HashMap<String, Integer> Quantity = new HashMap<String, Integer>(5);

        Prices.put("Burger", 10);
        Prices.put("Large Burger", 15);
        Prices.put("Burger With Extra Dip", 12);
        Prices.put("Cheese Burger", 20);
        Prices.put("Large Soda", 7);

        Quantity.put("Burger", Integer.parseInt(e1.getText().toString()) );
        Quantity.put("Large Burger", Integer.parseInt(e2.getText().toString()));
        Quantity.put("Burger With Extra Dip", Integer.parseInt(e3.getText().toString()));
        Quantity.put("Cheese Burger", Integer.parseInt(e4.getText().toString()));
        Quantity.put("Large Soda", Integer.parseInt(e5.getText().toString()));

        Intent intent = new Intent(this, Bill.class);
        intent.putExtra("Prices", Prices);
        intent.putExtra("Quantity", Quantity);
        startActivity(intent);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editTextNumber);
        e2=findViewById(R.id.editTextNumber10);
        e3=findViewById(R.id.editTextNumber11);
        e4=findViewById(R.id.editTextNumber12);
        e5=findViewById(R.id.editTextNumber13);

    }
}