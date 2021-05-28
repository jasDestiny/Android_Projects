package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ReceiverDemoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver_demo);
    }

    public void sendBroadcastIntent(View view){
        Intent it = new Intent();
        it.setAction("com.vit.CUSTOM_INTENT");
        sendBroadcast(it);

    }
}
