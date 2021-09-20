package com.example.ucsgamescape;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.zip.Deflater;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // CHAMA A MAIN ACTIVITY
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