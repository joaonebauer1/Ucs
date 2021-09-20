package com.example.ucsgamescape;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.util.zip.Deflater;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mMediaplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMediaplayer = MediaPlayer.create(this, R.raw.sound);
        mMediaplayer.start();

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

    // CHAMA A MAIN ACTIVITY.
    public void MainActivity(View view) {
        Intent mainActivity = new Intent(this, MainActivity.class);
        startActivity(mainActivity);

    }

    // CHAMA A TELA FOTO DO JOGADOR
    public void photoUserActivity(View view) {
        Intent photoUserActivity = new Intent(this, photoUserActivity.class);
        startActivity(photoUserActivity);

    }

    // FECHA O APLICATIVO
    public void finishActivity(View view) {
        finishAffinity();
    }
}