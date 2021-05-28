package com.example.admin.helloworldapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

@Override
    public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    TextView textView = (TextView)findViewById(R.id.msg);
    textView.setText(R.string.hello_world);
}
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }
    public void startService(View view){
        startService(new Intent(getBaseContext(), MyService.class));
    }
    public void stopService(View view){
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}
