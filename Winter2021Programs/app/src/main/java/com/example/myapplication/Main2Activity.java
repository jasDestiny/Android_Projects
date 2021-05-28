package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void startServiceMethod(View view){
        //Toast.makeText(this, "First Android App-SWE313", Toast.LENGTH_LONG).show();
        Intent it = new Intent(getBaseContext(),MyService.class);
        startService(it);

        //startService(new Intent(getBaseContext(),MyService.class));


    }
    public void stopServiceMethod(View view){
        //Toast.makeText(this, "First Android App-SWE313", Toast.LENGTH_LONG).show();
        stopService(new Intent(getBaseContext(),MyService.class));
    }

    public void display(View view){
        String name = getString(R.string.changeButton);
        Toast.makeText(this,name, Toast.LENGTH_LONG).show();
        ImageView iv = findViewById(R.id.imageView);
        //iv.setImageResource(R.drawable.download1);
        if ( iv.getDrawable()== null){
            Toast.makeText(this,"NOT LOADED", Toast.LENGTH_LONG).show();
        }
        else
        {
            if (iv.getDrawable().getConstantState() == getResources().getDrawable( R.drawable.download).getConstantState())
            {
                iv.setImageResource(R.drawable.download1);
            }
            else
            {
                iv.setImageResource(R.drawable.download);
            }
        }

    }
}
