package com.example.fibonaccicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.EditText;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {
    public EditText e, e2;

    public void setFibonacci(View view){
        long val=1;
        int n=Integer.parseInt(e.getText().toString());
        for(int i=1;i<=n;i++){
            val*=i;
        }
        
        e2.setText(String.valueOf(val));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e=findViewById(R.id.editTextTextPersonName);
        e2=findViewById(R.id.editTextTextPersonName2);
        InputFilter filter = new InputFilter() {
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                for (int i = start; i < end; i++) {
                    if (!Character.isDigit(source.charAt(i))){
                        return "";
                    }
                }
                return null;
            }
        };


        e.setFilters(new InputFilter[]{new InputFilter.LengthFilter(2), filter});
    }
}