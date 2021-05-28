package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    public EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ed1 = findViewById(R.id.editText6);
        ed2 = findViewById(R.id.editText7);

    }

    public void onLogin(View view){
        Intent it = new Intent(getApplicationContext(),AuthenticationService.class);

        it.putExtra("username",ed1.getText().toString());
        it.putExtra("password",ed2.getText().toString());

        startService(it);
        /*it.putExtra("username",ed1.getText().toString());
        it.putExtra("password",ed2.getText().toString());
        startService(it);*/
    }
}
