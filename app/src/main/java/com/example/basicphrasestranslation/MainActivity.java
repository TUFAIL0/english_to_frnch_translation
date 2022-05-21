package com.example.basicphrasestranslation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonpressed(View view){

        int id = view.getId();
        String ourId ="";


        ourId =view.getResources().getResourceEntryName(id);

        int resourceID = getResources().getIdentifier(ourId,"raw","com.example.basicphrasestranslation");

        MediaPlayer mplayer = MediaPlayer.create(this,resourceID);
        mplayer.start();
        Log.i("buttonpressed",ourId);

    }
}