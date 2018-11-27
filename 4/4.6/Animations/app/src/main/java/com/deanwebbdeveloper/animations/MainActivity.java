package com.deanwebbdeveloper.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationSet;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    //boolean mortyShown = true;

    public void fade(View view) {

        ImageView morty = findViewById(R.id.morty);

        morty.animate().translationXBy(1000f).translationYBy(1000f).alpha(1f).rotation(3600f).setDuration(1000);

        /*
        if (mortyShown == true) {
            morty.animate().scaleX(0.5f).scaleY(0.5f).setDuration(1000);
            mortyShown = false;
        } else {
            morty.animate().scaleX(1f).scaleY(1f).setDuration(1000);
            mortyShown = true;
        }
        */
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView morty = findViewById(R.id.morty);

        morty.setTranslationX(-1000f);
        morty.setTranslationY(-1000f);
        morty.setAlpha(0f);

    }
}
