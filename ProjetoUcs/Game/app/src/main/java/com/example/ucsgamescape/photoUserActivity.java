package com.example.ucsgamescape;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class photoUserActivity extends AppCompatActivity {

    private MediaPlayer mMediaplayer;

    private static final int REQUEST_IMAGE_CAPTURE = 100;
    ImageView imageView;
    Button btOpen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_user);
        mMediaplayer = MediaPlayer.create(this, R.raw.sound);
        mMediaplayer.start();

        imageView = findViewById(R.id.layoutImagem);
        btOpen = findViewById(R.id.bt_open);

        if (ContextCompat.checkSelfPermission(photoUserActivity.this,
                Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(photoUserActivity.this,
                    new String[]{
                            Manifest.permission.CAMERA
                    },
                    100);
        }
        btOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 100);

            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            Bitmap captureImage = (Bitmap) data.getExtras().get("data");
            imageView.setImageBitmap(captureImage);
        }
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

    // AVANÇA PARA NÍVEIS DE JOGO
    public void NiveisActivity(View view) {
        Intent NiveisActivity = new Intent(this, NiveisActivity.class);
        startActivity(NiveisActivity);
    }

    // VOLTA PARA MAIN
    public void MainActivity(View view) {
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);
    }

}