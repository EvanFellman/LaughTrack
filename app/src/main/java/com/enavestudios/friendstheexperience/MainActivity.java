package com.enavestudios.friendstheexperience;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try { this.getSupportActionBar().hide(); }
        catch (NullPointerException e){}
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        setContentView(R.layout.activity_main);
    }

    //Pressed when the button is pressed
    public void buttonPressed(View view){
        Log.i("hi", "hiiii");
        mp = MediaPlayer.create(this, R.raw.laugh1);
        mp.start();
    }
}