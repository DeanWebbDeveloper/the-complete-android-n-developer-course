package com.deanwebbdeveloper.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void resolveNumber(View view) {
        EditText myNumberInput = findViewById(R.id.myNumberInput);
        String myNumberToString = myNumberInput.getText().toString();
        int myNumberToInt = Integer.parseInt(myNumberToString);

        String myMessage = "";

        if (myNumberToString.isEmpty()) {
            myMessage = "You must enter a number!";
        } else {

            boolean isTriangle = false;
            boolean isSquare = false;

            int numberCounter = 1;

            while (numberCounter < myNumberToInt || !isTriangle || !true) {
                myMessage += "hello";
                isTriangle = true;
                isSquare = true;
                numberCounter++;
            }
        }

        Toast.makeText(MainActivity.this, myMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
