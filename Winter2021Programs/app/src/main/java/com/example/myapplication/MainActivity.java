package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    public EditText ed1,ed2,ed3;
    public Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent it = new Intent(getBaseContext(),BGService.class);
        startService(it);

        //Get References to the Control
        ed1 = findViewById(R.id.editText);
        ed2 = findViewById(R.id.editText2);
        ed3 = findViewById(R.id.editText3);

    }

    public void calculate(View view){
        int n1 = Integer.parseInt(ed1.getText().toString());
        int n2 = Integer.parseInt(ed2.getText().toString());
        int n3= n1+n2;
        String result = new Integer(n3).toString();
        ed3.setText(result);
        stopService(new Intent(getBaseContext(),BGService.class));

    }
}
