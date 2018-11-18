package com.deanwebbdeveloper.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Set function for button
    public void resolveNumber(View view) {

        //Find the input
        EditText myNumberInput = findViewById(R.id.myNumberInput);
        //Convert input to string
        String myNumberToString = myNumberInput.getText().toString();
        //Set string to show
        String myMessage;

        if (myNumberToString.isEmpty()) {
            //must be completed
            myMessage = "You must enter a number!";
        } else if (!myNumberToString.matches("[0-9]+")) {
            //must be an int
            myMessage = "You must enter an integer!";
        } else {
            //Must be int to convert to int or app will break
            int myNumberToInt = Integer.parseInt(myNumberToString);

            //set booleans for square and triangle
            boolean isTriangle = false;
            boolean isSquare = false;

            //iterate through each number up to value entered
            int numberCounter = 1;

            while (numberCounter <= myNumberToInt && (!isSquare || !isTriangle)) {

                if (!isSquare) {
                    //find if square
                    if (numberCounter * numberCounter == myNumberToInt) {
                        isSquare = true;
                    }
                }

                if (!isTriangle) {
                    //find if triangle
                    int triangleNumber = 0;
                    int triangleCounter = 1;

                    while (triangleCounter <= numberCounter) {
                        triangleNumber += triangleCounter;
                        triangleCounter++;
                    }

                    if (triangleNumber == myNumberToInt) {
                        isTriangle = true;
                    }
                }

                numberCounter++;
            }

            //Resolve message displayed
            if (isTriangle && isSquare) {
                myMessage = "The number " + myNumberToString + " is both Triangular and Square!";
            } else if (isTriangle) {
                myMessage = "The number " + myNumberToString + " is Triangular!";
            } else if (isSquare) {
                myMessage = "The number " + myNumberToString + " is Square!";
            } else {
                myMessage = "The number " + myNumberToString + " is neither Triangular nor Square!";
            }

        }

        //Display the message
        Toast.makeText(MainActivity.this, myMessage, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
