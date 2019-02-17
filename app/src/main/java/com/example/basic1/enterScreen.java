package com.example.basic1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;


public class enterScreen extends AppCompatActivity {

    private Button login;
    private Button create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_screen);

        login = (Button)findViewById(R.id.loginButton);
        create = (Button)findViewById(R.id.createButton);

        login.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent(enterScreen.this, MainActivity.class);
                startActivity(intent);
            }
        });

        create.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent(enterScreen.this, createScreen.class);
                startActivity(intent);
            }
        });
    }


}
