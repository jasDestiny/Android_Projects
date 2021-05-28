 package com.example.calculator_app;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class CopySound extends Service {
    public CopySound() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        final MediaPlayer cc= MediaPlayer.create(this, R.raw.copyclip);
        cc.start();
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