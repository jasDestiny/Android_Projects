package com.example.array_resource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void ProcessIt(View view){
        int[] arr =getResources().getIntArray(R.array.arr);
        Class c=getClass();
        int pos=0, neg=0, odd=0, even=0, integer=0, floats=0;
        for(int i=0;i<arr.length;i++){
            if(i>0)
                pos+=1;
            else
                neg+=1;

            if(i%2==1)
                odd+=1;
            else
                even+=1;

            if(i-(int)i>0)
                floats+=1;
            else if (i-(int)i==0)
                integer+=1;
        }
        Toast.makeText(getApplicationContext(), String.valueOf(pos), Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), String.valueOf(neg), Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), String.valueOf(odd), Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), String.valueOf(even), Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), String.valueOf(integer), Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(), String.valueOf(floats), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}