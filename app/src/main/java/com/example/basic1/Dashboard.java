package com.example.basic1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class Dashboard extends AppCompatActivity {

    private Button findFriend;
    private Button profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        findFriend = (Button)findViewById(R.id.findFriend);
        profile = (Button)findViewById(R.id.profile);

        findFriend.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent(Dashboard.this, FindAFriend.class);
                startActivity(intent);
            }
        });

        profile.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent = new Intent(Dashboard.this, FindAFriend.class); // change to profile when it happens
                startActivity(intent);
            }
        });

        // needs to import a users friends and displays them on the line below in an infinite scroll
    }
}
