package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;

public class AuthenticationService extends Service {
    public AuthenticationService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        //Toast.makeText(this, "SERVICE Started", Toast.LENGTH_LONG).show();
        String uname= intent.getExtras().getString("username");
        String pass= intent.getExtras().getString("password");
        Intent i = new Intent();
        i.setClass(this, LoginResultActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(i);
        Intent it = new Intent(getApplicationContext(),LoginResultActivity.class);
        //Bundle bundle = new Bundle();
        if (uname.equals("MTECHSE") && pass.equals("SWE2008")){
            /*it.putExtra("result","LOGIN SUCCESS");
            it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(new Intent(this, LoginResultActivity.class));*/
            Toast.makeText(this, "LOGIN SUCCESSFUL", Toast.LENGTH_LONG).show();
        }
        else
        {
            //it.putExtra("result","LOGIN FAILED");
            //startActivity(new Intent(this, LoginResultActivity.class));
            //startActivity(it);
            Toast.makeText(this, "LOGIN FAILED", Toast.LENGTH_LONG).show();
        }

        return START_STICKY;
    }
    @Override
    public void onDestroy(){
        //super.onDestroy();
        //Toast.makeText(this, "SERVICE DESTROYED", Toast.LENGTH_LONG).show();

    }

}
