package com.example.android.tourguideapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.widget.ImageView;

public class Splash extends Activity {

    private final int SPLASH_LENGTH = 1500;

    @Override
    public void onCreate (Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash);
        ImageView iv = (ImageView) findViewById(R.id.imageView2);

        iv.setImageResource(R.drawable.malaysiaicon);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent (Splash.this, MainActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_LENGTH);
    }
}
