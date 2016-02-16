package com.david.healthapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner drinkSpinner = (Spinner) findViewById(R.id.drinkSpinner);
        Spinner smokeSpinner = (Spinner) findViewById(R.id.smokeSpinner);
        Spinner tummySpinner = (Spinner) findViewById(R.id.tummySpinner);

        ArrayAdapter<CharSequence> drinkOptionsAdapter = ArrayAdapter.createFromResource(this,
                R.array.drinks_array, android.R.layout.simple_spinner_dropdown_item);

        drinkSpinner.setAdapter(drinkOptionsAdapter);
        smokeSpinner.setAdapter(drinkOptionsAdapter);
        tummySpinner.setAdapter(drinkOptionsAdapter);

        final Button saveButton = (Button) findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Perform saveButton Actions
            }
        });
    }
}
