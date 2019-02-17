package com.example.basic1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.RadioButton;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;

public class createScreen2 extends AppCompatActivity {

    private Spinner genderChoices, meyerChoices, enneagramChoices;
    private RadioButton meyerBriggs,enneagram;
    private ImageView profilePhoto;
    private Button uploadButton;
    private TextView profileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_screen2);

        genderChoices = (Spinner) findViewById(R.id.genderSpinner);
        ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(this,
                R.array.genders, android.R.layout.simple_spinner_item);
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        genderChoices.setAdapter(genderAdapter);

        meyerChoices = (Spinner) findViewById(R.id.meyerSpinner);
        ArrayAdapter<CharSequence> meyerAdapter = ArrayAdapter.createFromResource(this,
                R.array.meyerBriggs, android.R.layout.simple_spinner_item);
        meyerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        meyerChoices.setAdapter(meyerAdapter);

        enneagramChoices = (Spinner) findViewById(R.id.enneagramSpinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.enneagrams, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        enneagramChoices.setAdapter(adapter);

        meyerBriggs = (RadioButton) findViewById(R.id.meyer_Briggs);
        enneagram = (RadioButton) findViewById(R.id.enneagram);
        profilePhoto = (ImageView) findViewById(R.id.profilePhoto);
        uploadButton = (Button) findViewById(R.id.uploadButton);
        profileName = (TextView) findViewById(R.id.profileName);

        //get profile name from database
        //profileName.setText();

    }

}
