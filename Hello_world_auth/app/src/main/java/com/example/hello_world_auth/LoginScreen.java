package com.example.hello_world_auth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {
    public EditText e1,e2;
    public Button b;

    public void loginClick(View view){
        Intent it= new Intent(getApplicationContext(), AuthService.class);
        it.putExtra("user", e1.getText().toString());
        it.putExtra("pass", e2.getText().toString());

        startService(it);
        stopService(it);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        e1= findViewById(R.id.editTextTextPersonName);
        e2= findViewById(R.id.editTextTextPassword);
    }
}