package com.example.hello_world_auth;

import android.app.Service;
import java.util.HashMap;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class AuthService extends Service {
    public AuthService() {
    }
    public HashMap<String, String> users = new HashMap<String, String>();

    @Override    
    public int onStartCommand(Intent intent, int flags, int startId) {
        users.put("18MIS0346", "abc123");
        users.put("18MIS0363", "DEF456");
        users.put("18MIS0921", "KJA910");

        String u=intent.getExtras().getString("user");
        String p=intent.getExtras().getString("pass");

        if(users.containsKey(u)){
            if(users.get(u).contentEquals(p)){
                Toast.makeText(getApplicationContext(), "Redirecting to your application", Toast.LENGTH_SHORT).show();
                Intent dialogIntent = new Intent(this, MainActivity.class);
                dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(dialogIntent);
            }

            else{
                Toast.makeText(getApplicationContext(), "Invalid password", Toast.LENGTH_LONG).show();
            }
        }

        else{
            Toast.makeText(getApplicationContext(), "User not registered", Toast.LENGTH_LONG).show();
        }

        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}