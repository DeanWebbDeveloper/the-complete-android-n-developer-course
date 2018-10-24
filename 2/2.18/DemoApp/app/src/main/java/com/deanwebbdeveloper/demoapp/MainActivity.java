package com.deanwebbdeveloper.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {



    public void convertCurrency(View view) {

        EditText currencyEntry = (EditText) findViewById(R.id.currencyEntry);
        String currencyString = currencyEntry.getText().toString();
        Double currencyToPounds = (Double.parseDouble(currencyString)) * 0.76;
        DecimalFormat dp = new DecimalFormat("#.00");

        Log.i("info", "converted");
        Toast.makeText(MainActivity.this, "£" + (dp.format(currencyToPounds)).toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
