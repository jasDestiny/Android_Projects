package com.example.admin.helloworldapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

    public EditText ed1,ed2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void onLogin(View view){
        ed1=(EditText)findViewById(R.id.editText);
        ed2=(EditText)findViewById(R.id.editText2);

        Intent it = new Intent(Main3Activity.this, Main4Activity.class);
        it.putExtra("username",ed1.getText().toString());
        it.putExtra("pwd",ed2.getText().toString());
        startActivity(it);
    }


}
