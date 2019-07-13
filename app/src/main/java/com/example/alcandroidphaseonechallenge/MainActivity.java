package com.example.alcandroidphaseonechallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView welcome_txt;
    Button profile_btn, about_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        initializing the welcome textView
        welcome_txt = (TextView)findViewById(R.id.welcome_txt);

//        initializing the buttons
        profile_btn = (Button) findViewById(R.id.btn_profile);
        about_btn = (Button) findViewById(R.id.btn_about_alc);

//   creating an onClickListener with an intent to start  the ProfileActivity after button is clicked
        profile_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profileIntent);
            }
        });

//   creating an onClickListener with an intent to start  the AboutActivity after button is clicked
        about_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(aboutIntent);
            }
        });
    }
}
