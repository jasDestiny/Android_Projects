package com.example.temperatureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup r=findViewById(R.id.radioGroup);
        r.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId!=-1){
                    EditText e= findViewById(R.id.editTextNumber);
                    float temp=Float.parseFloat(e.getText().toString());
                    RadioButton r=(RadioButton)findViewById(checkedId);
                    if(r.getText().equals("Celcius")){
                        e.setText(String.valueOf((temp-32)*5/9));
                    }
                    else{
                        e.setText(String.valueOf((temp*9/5)+32));
                    }
                }
            }
        });

    }
}