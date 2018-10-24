package com.deanwebbdeveloper.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    boolean flag = false;

    public void changeImage(View view) {


        ImageView imageView = findViewById(R.id.imageView);
        if(flag==false)
        {
            imageView.setImageResource(R.drawable.spartan);
            flag=true;
        }
        else
        {
            imageView.setImageResource((R.drawable.lion));
            flag=false;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
