package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LoginResultActivity extends AppCompatActivity {

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_result);
        String result= getIntent().getExtras().getString("result");
        tv1.setText(result.toString());

    }
}
