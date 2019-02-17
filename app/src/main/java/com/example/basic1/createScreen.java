package com.example.basic1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.Window;
import android.view.WindowManager;


public class createScreen extends AppCompatActivity {

    private EditText Name, Username, Password, PasswordAttempt;
    private Button makeAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_create_screen);

        Name = (EditText)findViewById(R.id.newName);
        Username = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        PasswordAttempt = (EditText)findViewById(R.id.passwordAttempt);
        makeAccount = (Button) findViewById(R.id.makeAccountButton);
    }

}
