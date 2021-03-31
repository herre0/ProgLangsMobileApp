package mert.prog.dilleri;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


import pl.droidsonroids.gif.GifImageView;

public class SplashScreen extends Activity {
    GifImageView gifImageView;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent mainIntent = new Intent(SplashScreen.this, MainActivity.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, 3400);
    }
}
