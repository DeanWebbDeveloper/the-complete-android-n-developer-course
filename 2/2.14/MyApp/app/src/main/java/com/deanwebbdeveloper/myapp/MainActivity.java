package com.deanwebbdeveloper.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void nameFunction (View view) {

        EditText nameField = findViewById(R.id.nameField);
        String nameFieldText = nameField.getText().toString();

        Toast.makeText(MainActivity.this, "Hi there, " + nameFieldText, Toast.LENGTH_SHORT).show();

        Log.i("Name", nameFieldText);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
