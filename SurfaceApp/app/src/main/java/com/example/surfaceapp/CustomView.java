package com.example.surfaceapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CustomView extends SurfaceView {
    private boolean playing = true;

    public CustomView(Context context) {
        super(context);
        new Anim().start();
    }

    private class Anim extends Thread {
        int counter = 0;

        @Override
        public void run() {
            long delay = 100;
            long lastUpdatedTime = 0;
            int ids[] = {
                    R.drawable.b9,
                    R.drawable.b2,
                    R.drawable.b3,
                    R.drawable.b4,
                    R.drawable.b5,
                    R.drawable.b6,
                    R.drawable.b7,
                    R.drawable.b8
            };


            while (true) {
                if (playing) {
                    long current_time = System.currentTimeMillis();
                    if (current_time > lastUpdatedTime + delay) {
                        if (counter >= 7) {
                            counter = 0;
                        }
                        draw(ids[counter]);
                        lastUpdatedTime = current_time;
                        counter++;
                    }
                }
            }


        }

        private void draw(int img_ids){
            SurfaceHolder holder=getHolder();
            Canvas canvas= holder.lockCanvas();
            if(canvas!=null){
                canvas.drawColor(Color.WHITE);
                Paint paint=new Paint();
                Bitmap bitmap= BitmapFactory.decodeResource(getContext().getResources(), img_ids);
                canvas.drawBitmap(bitmap, 0, 600, paint);
                holder.unlockCanvasAndPost(canvas);
            }
        }
    }
}