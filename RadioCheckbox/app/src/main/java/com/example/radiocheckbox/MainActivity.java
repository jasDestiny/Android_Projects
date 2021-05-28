package com.example.radiocheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox c1=findViewById(R.id.checkBox);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = c1.isChecked();
                if(checked)
                    Toast.makeText(MainActivity.this, c1.getText().toString()+" is checked", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "ME is unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox c2=findViewById(R.id.checkBox2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = c2.isChecked();
                if(checked)
                    Toast.makeText(MainActivity.this, "MTech is checked", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "MTech is unchecked", Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox c3=findViewById(R.id.checkBox3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean checked = c3.isChecked();
                if(checked)
                    Toast.makeText(MainActivity.this, "MCA is checked", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "MCA is unchecked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}