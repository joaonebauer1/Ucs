package com.example.ucsgamescape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;

public class NiveisActivity extends AppCompatActivity {

    Button btVibrar;
    private MediaPlayer mMediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_niveis);
        mMediaplayer = MediaPlayer.create(this, R.raw.sound);
        mMediaplayer.start();

        btVibrar = findViewById(R.id.escolha);
        btVibrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vibrar();
            }
        });

    }

    private void vibrar() {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
        long mili = 500;
        v.vibrate(mili);
    }

    // CHAMA A level Easy
    public void EasyActivity(View view1) {
        Intent EasyActivity = new Intent(this, EasyActivity.class);
        startActivity(EasyActivity);
        vibrar();
    }

    // CHAMA A level Medium
    public void MediumActivity(View view2) {
        Intent MediumActivity = new Intent(this, MediumActivity.class);
        startActivity(MediumActivity);
        vibrar();
    }

    // CHAMA A level hard
    public void HardActivity(View view3) {
        Intent HardActivity = new Intent(this, HardActivity.class);
        startActivity(HardActivity);
        vibrar();
    }

    private void releaseMediaPlayer(){
        if (mMediaplayer != null){
            mMediaplayer.release();
            mMediaplayer = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }

    // VOLTA PARA FOTO JOGADOR
    public void photoUserActivity(View view) {
        Intent photoUserAActivity = new Intent(this, photoUserActivity.class);
        startActivity(photoUserAActivity);
    }
}