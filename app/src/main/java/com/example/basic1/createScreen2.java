package com.example.basic1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.RadioButton;

public class createScreen2 extends AppCompatActivity {

    private Spinner genderChoices;
    private TextView gender, testTypes;
    private RadioButton meyerBriggs,enneagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_screen2);

        genderChoices = (Spinner) findViewById(R.id.genderSpinner);
        gender = (TextView) findViewById(R.id.gender);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.genders, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderChoices.setAdapter(adapter);

        testTypes = (TextView) findViewById(R.id.testTypes);
        meyerBriggs = (RadioButton) findViewById(R.id.meyer_Briggs);
        enneagram = (RadioButton) findViewById(R.id.enneagram);






    }
}
