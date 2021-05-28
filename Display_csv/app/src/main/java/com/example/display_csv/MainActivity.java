package com.example.display_csv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class MainActivity extends AppCompatActivity {

    public void ShowFacts(View view){
        try {
            CSVReader reader=new CSVReader(new FileReader("states.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            Toast.makeText(this, "ERROR", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


}