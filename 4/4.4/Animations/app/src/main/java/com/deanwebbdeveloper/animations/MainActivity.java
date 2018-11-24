package com.deanwebbdeveloper.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean mortyShown = true;

    public void fade(View view) {

        ImageView morty = findViewById(R.id.morty);
        ImageView rick = findViewById(R.id.rick);

        if (mortyShown == true) {
            morty.animate().alpha(0f).setDuration(1000);
            rick.animate().alpha(1f).setDuration(1000);
            mortyShown = false;
        } else {
            morty.animate().alpha(1f).setDuration(1000);
            rick.animate().alpha(0f).setDuration(1000);
            mortyShown = true;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
