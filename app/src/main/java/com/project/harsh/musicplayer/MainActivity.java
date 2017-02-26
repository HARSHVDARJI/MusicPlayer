package com.project.harsh.musicplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
//    ImageView imageView;
    ToggleButton tb;
    MediaPlayer mp;
//    boolean play = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tb=(ToggleButton)findViewById(R.id.togglebutton);

         mp = MediaPlayer.create(MainActivity.this, R.raw.tammatamma);

        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tb.isChecked()) {
                    mp.start();
                } else {
                    mp.pause();
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mp.release();
    }
}
