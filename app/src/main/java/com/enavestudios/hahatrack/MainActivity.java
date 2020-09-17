package com.enavestudios.hahatrack;

import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
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
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    protected void onResume() {
        super.onResume();
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    //Pressed when the button is pressed
    public void buttonPressed(View view){
        switch((int) Math.ceil(Math.random() * 9)){
            case 1:
                mp = MediaPlayer.create(this, R.raw.laugh1);
                break;
            case 2:
                mp = MediaPlayer.create(this, R.raw.laugh2);
                break;
            case 3:
                mp = MediaPlayer.create(this, R.raw.laugh3);
                break;
            case 4:
                mp = MediaPlayer.create(this, R.raw.laugh4);
                break;
            case 5:
                mp = MediaPlayer.create(this, R.raw.laugh5);
                break;
            case 6:
                mp = MediaPlayer.create(this, R.raw.laugh6);
                break;
            case 7:
                mp = MediaPlayer.create(this, R.raw.laugh7);
                break;
            case 8:
                mp = MediaPlayer.create(this, R.raw.laugh8);
                break;
            case 9:
                mp = MediaPlayer.create(this, R.raw.laugh9);
                break;
            default:
                break;
        }
        mp.start();
    }
}