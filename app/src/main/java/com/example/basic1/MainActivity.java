package com.example.basic1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

//Main Activity is actually the login page.
public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = (EditText)findViewById(R.id.userName);
        Password = (EditText)findViewById(R.id.password);
        Login = (Button)findViewById(R.id.login);


    }

    private void validate(String username, String password)
    {
        //connect to server
        //check for existing username
        //validate if password is correct
    }
}
