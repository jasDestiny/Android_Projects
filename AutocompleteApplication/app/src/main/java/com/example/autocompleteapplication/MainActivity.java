package com.example.autocompleteapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.EventListener;

public class MainActivity extends AppCompatActivity {
    public void toastname(View view){
        // Selection of the spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);
        Toast.makeText(this, spinner.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView a=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        MultiAutoCompleteTextView b=(MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView);

        final String[] cities= new String[]{"Delhi", "Bombay", "Madras", "Calcutta"};
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, cities);
        a.setAdapter(adapter);

        b.setAdapter(adapter);
        b.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        String colors[] = {"Red","Blue","White","Yellow","Black", "Green","Purple","Orange","Grey"};

// Selection of the spinner
        Spinner spinner = (Spinner) findViewById(R.id.spinner2);

// Application of the Array to the Spinner
        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   android.R.layout.simple_spinner_item, colors);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        spinner.setAdapter(spinnerArrayAdapter);

    }
}