package com.example.vasu.vaisnavasongs;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashScreen extends AppCompatActivity {

    // Splash screen timer
    private final static int SPLASH_TIME_OUT = 2500;

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        imageView = (ImageView)findViewById(R.id.splashImage);
        textView = (TextView)findViewById(R.id.splashText);

        //loads the animation file from anim folder
        Animation animation = AnimationUtils.loadAnimation(this,R.anim.my_transition);
        //applies animation to TextView and ImageView
        imageView.startAnimation(animation);
        textView.startAnimation(animation);

        /*
         * Showing splash screen with a timer. This will be useful when you
         * want to show case your app logo / company
         */
        new Handler().postDelayed(new Runnable() {
            // This method will be executed once the timer is over
            // Start your app main activity
            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent it = new Intent(splashScreen.this,MainActivity.class);
                it.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(it);
                // close this activity
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
