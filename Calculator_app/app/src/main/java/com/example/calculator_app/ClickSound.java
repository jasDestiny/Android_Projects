package com.example.calculator_app;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class ClickSound extends Service {
    public ClickSound() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        final MediaPlayer cs= MediaPlayer.create(this, R.raw.clicksound);
        cs.start();
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}