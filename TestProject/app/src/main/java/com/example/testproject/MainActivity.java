package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText e1, e2;
    public Button b;

    public void login(View view){
        Context context = getApplicationContext();
        CharSequence text = e1.getText().toString();
        Toast.makeText(getBaseContext(), e1.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPassword);
    }
}