package com.example.ucsgamescape;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class photoUserActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_user);
    }

//    // tira foto do jogador
//    public void Class_LevelEasy(View view) {
//        Intent Class_LevelEasy = new Intent(this,Class_LevelEasy.class);
//        startActivity(Class_LevelEasy);
//    }

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