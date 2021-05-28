package com.example.testproject;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class VerifyUser extends Service {
    public VerifyUser() {

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return
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