package com.example.calculator_app;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
    public EditText e1, e2, e3;
    public Button p, m, d, ml;
    public void doService1(){
        startService(new Intent(getBaseContext(), ClickSound.class));
        stopService(new Intent(getBaseContext(), ClickSound.class));
    }

    public void doService2(){
        startService(new Intent(getBaseContext(), CopySound.class));
        stopService(new Intent(getBaseContext(), CopySound.class));
    }

    public void add(View view){
        doService1();
        float n1, n2, n3;
        n1= Float.parseFloat(e1.getText().toString());
        n2= Float.parseFloat(e2.getText().toString());
        n3=n2+n1;

        String res= new Float(n3).toString();
        e3.setText(res);

    }

    public void sub(View view){
        doService1();
        float n1, n2, n3;
        n1= Float.parseFloat(e1.getText().toString());
        n2= Float.parseFloat(e2.getText().toString());
        n3=n1-n2;

        String res= new Float(n3).toString();
        e3.setText(res);
    }

    public void mul(View view){
        doService1();
        float n1, n2, n3;
        n1= Float.parseFloat(e1.getText().toString());
        n2= Float.parseFloat(e2.getText().toString());
        n3=n2*n1;

        String res= new Float(n3).toString();
        e3.setText(res);
    }

    public void div(View view){
        doService1();
        float n1, n2, n3;
        n1= Float.parseFloat(e1.getText().toString());
        n2= Float.parseFloat(e2.getText().toString());
        n3=n1/n2;

        String res= new Float(n3).toString();
        e3.setText(res);
    }

    public void restonumone(View view){
        doService2();
        e1.setText(e3.getText().toString());
    }

    public void restonumtwo(View view){
        doService2();
        e2.setText(e3.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1= findViewById(R.id.editTextTextPersonName);
        e2= findViewById(R.id.editTextTextPersonName2);
        e3= findViewById(R.id.editTextTextPersonName3);
    }
}