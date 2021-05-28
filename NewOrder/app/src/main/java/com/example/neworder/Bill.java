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

public class Bill extends AppCompatActivity {

    public EditText e1, e2, e3;
    public void modifyOrder(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bill);

        Intent intent = getIntent();
        HashMap<String, Integer> Prices = (HashMap)intent.getSerializableExtra("Prices");
        HashMap<String, Integer> Quantity = (HashMap)intent.getSerializableExtra("Quantity");

        Iterator hmIterator = Quantity.entrySet().iterator();
        String items="", cost="";
        int total=0;


        while (hmIterator.hasNext()) {
            Map.Entry mapElement = (Map.Entry)hmIterator.next();
            int i = ((int)mapElement.getValue());
            if(i!=0){
                items+=mapElement.getKey()+", " ;
                cost+="$"+String.valueOf(Integer.parseInt(String.valueOf(Prices.get(mapElement.getKey())))*i)+", ";
                total+=Integer.parseInt(String.valueOf(Prices.get(mapElement.getKey())))*i;
            }
        }

        e1=findViewById(R.id.editTextTextPersonName);
        e1.setText(items);

        e2=findViewById(R.id.editTextTextPersonName2);
        e3=findViewById(R.id.editTextTextPersonName3);


        e2.setText(cost);
        e3.setText("$"+String.valueOf(total));

    }
}