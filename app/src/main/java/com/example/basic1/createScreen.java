package com.example.basic1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.Window;
import android.view.WindowManager;


public class createScreen extends AppCompatActivity {

    private EditText Name, Username, Password, PasswordAttempt;
    private Button makeAccount;
    private TextView screenError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
        setContentView(R.layout.activity_create_screen);

        Name = (EditText)findViewById(R.id.name);
        Username = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);
        PasswordAttempt = (EditText)findViewById(R.id.passwordAttempt);
        makeAccount = (Button) findViewById(R.id.makeAccountButton);
        screenError = (TextView) findViewById(R.id.createErrorMsg);

        makeAccount.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                //if passwords are not the same
                if(!(Password.getText().toString().equals(PasswordAttempt.getText().toString())))
                {
                    screenError.setText(Password.getText().toString()+" "+PasswordAttempt.getText().toString());
                }
                else
                {
                    Intent intent = new Intent(createScreen.this, createScreen2.class);
                    startActivity(intent);
                }
            }
        });
    }

}
