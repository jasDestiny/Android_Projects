package com.example.admin.helloworldapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class Main2Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void customIntent(View view){
        Intent it =new Intent();
        it.setAction("com.vit.swe.CUSTOM_INTENT");
        sendBroadcast(it);
    }

}
