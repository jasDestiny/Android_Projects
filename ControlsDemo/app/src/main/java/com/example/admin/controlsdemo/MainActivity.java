package com.example.admin.controlsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.view.View;



public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    String[] country = { "India", "USA", "China", "Japan", "Other",  };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txtName = (EditText)findViewById(R.id.txtName);
        txtName.setFilters(new InputFilter[]{new InputFilter.AllCaps(),new InputFilter.LengthFilter(5)});

        final String colors[] = {"RED", "GREEN", "BLUE", "PURPLE", "VIOLET","INDIGO","YELLOW","ORANGE","MAGENTA","CYAN"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,colors);
        AutoCompleteTextView autoText = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        autoText.setAdapter(adapter);

        final String fruits[] = {"mango", "banana", "jackfruit", "pineapple", "orange","grapes","muskmelon","watermelon","mangoose"};
        ArrayAdapter<String> fAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,fruits);
        MultiAutoCompleteTextView mtext =(MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        mtext.setAdapter(fAdapter);
        mtext.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        /*final Spinner spin = (Spinner) findViewById(R.id.spinner2);
        TextView text_sel = (TextView)spin.getSelectedView();
        System.out.println(text_sel);
        String selected_text = text_sel.getText().toString();
        Toast.makeText(this,selected_text,Toast.LENGTH_LONG).show();*/
        Spinner spin = (Spinner) findViewById(R.id.spinner2);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,country);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Setting the ArrayAdapter data on the Spinner
        spin.setAdapter(aa);


    }
    //Performing action onItemSelected and onNothing selected
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {
        Toast.makeText(getApplicationContext(),country[position] ,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }


}
