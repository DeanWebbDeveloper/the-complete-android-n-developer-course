package com.deanwebbdeveloper.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void loginFunction(View view) {

        EditText loginUsername = findViewById(R.id.loginUsername); //(EditText) before findViewById is now redundant, so not included
        EditText loginPassword = findViewById(R.id.loginPassword);

        Log.i("Login Details", "Username: \"" + loginUsername.getText().toString() + "\", Password: \"" + loginPassword.getText().toString() + "\"" );

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
