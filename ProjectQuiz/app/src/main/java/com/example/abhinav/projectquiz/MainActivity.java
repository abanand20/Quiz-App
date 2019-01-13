package com.example.abhinav.projectquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    ImageView quiz_image;
    public Timer t;

    public void onCreate(Bundle b) {

        super.onCreate(b);
        setContentView(R.layout.activity_main);
        quiz_image=(ImageView)findViewById(R.id.quiz_image) ;
        t = new Timer();
        t.schedule (new TimerTask() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        }, 3000);

    }
}