package com.example.myapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

public class BGService extends Service {
    MediaPlayer mediaPlayer;
    public BGService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }


    @Override
    public int onStartCommand(Intent intent,int flags,int startId){
        //Toast.makeText(this, "SERVICE Started", Toast.LENGTH_LONG).show();
        mediaPlayer = MediaPlayer.create(this,R.raw.soundfile);
        mediaPlayer.setLooping(true); // Set looping
        mediaPlayer.setVolume(100, 100);
        mediaPlayer.start();
        return START_STICKY;
    }
    @Override
    public void onDestroy(){
        //super.onDestroy();
        //Toast.makeText(this, "SERVICE DESTROYED", Toast.LENGTH_LONG).show();
        mediaPlayer.stop();
        mediaPlayer.release();
    }

}
