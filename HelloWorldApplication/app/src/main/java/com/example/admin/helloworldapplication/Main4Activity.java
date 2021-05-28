package com.example.admin.helloworldapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    TextView tv;
    String uname,pwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        tv=(TextView)findViewById(R.id.textView);
        Bundle extras = getIntent().getExtras();
        if (extras!=null)
            uname = extras.getString("username");
            pwd=extras.getString("pwd");
            if(uname.equals("SWE2008") && pwd.equals("VIT")){
                tv.setText(R.string.loginSuccess);
                tv.setTextColor(getResources().getColor(R.color.loginSuccess));
            }
            else{
                tv.setText(R.string.loginFailed);
                tv.setTextColor(getResources().getColor(R.color.loginFailed));
            }

    }
}
