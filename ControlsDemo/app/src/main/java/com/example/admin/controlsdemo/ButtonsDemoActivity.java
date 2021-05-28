package com.example.admin.controlsdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.CheckBox;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import android.widget.Switch;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.graphics.Color;
public class ButtonsDemoActivity extends AppCompatActivity {
    CheckBox mba,mca,me,mtech;
    Button basic_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_demo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        basic_button = (Button) findViewById(R.id.button);
        basic_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(ButtonsDemoActivity.this,"Button clicked", Toast.LENGTH_SHORT).show();
            }
        });


        addListenerOnButtonClick();
        final RadioGroup group = (RadioGroup)findViewById(R.id.RadioGroup01);
        final TextView tv = (TextView)findViewById(R.id.textView3);
        group.setOnCheckedChangeListener(new  RadioGroup.OnCheckedChangeListener() {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId != -1) {
                    RadioButton rb = (RadioButton)findViewById(checkedId);
                    if (rb != null) {
                        tv.setText("You chose: " + rb.getText());
                    }
                } else {
                    tv.setText("Choose Gender");
                }
            }
        });
        /*final CheckBox check_button = (CheckBox) findViewById(R.id.checkbox);
        check_button.setOnClickListener(new View.OnClickListener() {
            public void onClick (View v) {
                CheckBox cb = (CheckBox)findViewById(R.id.checkbox);
                cb.setText(check_button.isChecked() ?"This option is checked" :"This option is not checked");
            }
        });*/
        final ToggleButton b1 = (ToggleButton) findViewById(R.id.toggleButton2);
        final ToggleButton b2 = (ToggleButton) findViewById(R.id.toggleButton);

// attach an OnClickListener
        b1.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                StringBuilder result = new StringBuilder();
                result.append("ToggleButton1 : ").append(b1.getText());
                result.append("\nToggleButton2 : ").append(b2.getText());
                //Displaying the message in toast
                Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();
            }
        });

        final LinearLayout rl = (LinearLayout) findViewById(R.id.mylayout);
        Switch switch_button = (Switch) findViewById(R.id.switch2);

        // Set a checked change listener for switch button
        switch_button.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                /*if(isChecked){
                    // If the switch button is on
                    rl.setBackgroundColor(Color.parseColor("#FF80DFB0"));

                    // Show the switch button checked status as toast message
                    Toast.makeText(getApplicationContext(),
                            "Switch is on", Toast.LENGTH_LONG).show();

                }
                else {
                    // If the switch button is off
                    rl.setBackgroundColor(Color.parseColor("#ed252f"));

                    // Show the switch button checked status as toast message
                    Toast.makeText(getApplicationContext(),
                            "Switch is off", Toast.LENGTH_LONG).show();
                }*/
                if(isChecked){
                    Toast.makeText(getApplicationContext(), "SWITCHED ON",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "SWITCHED Off",Toast.LENGTH_LONG).show();
                }
                Log.v("Switch State=", ""+isChecked);
            }
        });

    }
    public void addListenerOnButtonClick() {
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        mba = (CheckBox) findViewById(R.id.checkBox1);
        mca = (CheckBox) findViewById(R.id.checkBox2);
        me = (CheckBox) findViewById(R.id.checkBox3);
        mtech = (CheckBox) findViewById(R.id.checkBox4);
        basic_button = (Button) findViewById(R.id.button);
        basic_button.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View view) {

                StringBuilder result=new StringBuilder();
                result.append("You have");
                if(mba.isChecked()){
                    result.append("\nSelected MBA");

                }
                if(mca.isChecked()){
                    result.append("\nSelected MCA");

                }
                if(me.isChecked()){
                    result.append("\nSelected ME");

                }
                if(mtech.isChecked()){
                    result.append("\nSelected M.Tech");

                }
                //result.append("\nYou have: "+totalamount+"Rs");
                //Displaying the message on the toast
                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }


    }
