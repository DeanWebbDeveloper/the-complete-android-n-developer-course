package com.deanwebbdeveloper.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int numberGenerated = new Random().nextInt(20) + 1;

    public void guessNumber(View view) {

        EditText numberSelected = findViewById(R.id.guessSelect);
        String result;

        if(TextUtils.isEmpty(numberSelected.getText())) {
            result = "A number is required!";
        } else {

            int numberSelectedInt = Integer.parseInt(numberSelected.getText().toString());

            if (numberSelectedInt < 1 || numberSelectedInt > 20){
                result = "The number must be between 1 and 20";
            } else if (numberSelectedInt == numberGenerated) {
                result = "Congratulations! The number was " + String.valueOf(numberGenerated);
            } else if (numberSelectedInt > numberGenerated) {
                result = "Lower!";
            } else if (numberSelectedInt < numberGenerated) {
                result = "Higher!";
            } else {
                result = "The value you have inserted is invalid. It must be a number between 1 and 20.";
            }
        }

        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
