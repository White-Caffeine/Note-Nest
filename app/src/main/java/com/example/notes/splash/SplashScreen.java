package com.example.notes.splash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.notes.R;
import com.example.notes.activities.MainActivity;

public class SplashScreen extends AppCompatActivity {

    private VideoView splashVideo;
    private TextView ownerInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        splashVideo= findViewById(R.id.splashVideo);
//        MediaController mediaController= new MediaController(this);
//        mediaController.setAnchorView(splashVideo);
//        splashVideo.setMediaController(mediaController);
        splashVideo.setVideoURI(Uri.parse("android.resource://"+ getPackageName() + "/" + R.raw.splash));
        splashVideo.start();
        ownerInfo= findViewById(R.id.ownerInfo);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent= new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4900);
    }


}