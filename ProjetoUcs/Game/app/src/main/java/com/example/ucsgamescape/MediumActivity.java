package com.example.ucsgamescape;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MediumActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medium);
    }


    // voltar
    public void NiveisActivity(View view) {
        Intent NiveisActivity = new Intent(this, NiveisActivity.class);
        startActivity(NiveisActivity);
    }

}