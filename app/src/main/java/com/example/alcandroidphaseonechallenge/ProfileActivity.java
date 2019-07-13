package com.example.alcandroidphaseonechallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    ImageView profile;
    TextView profile_name, track, country, email, phoneNumber, slackUsername;
    View divider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
//        initializing the ImageView for the profile image in the profile-activity.xml
        profile = (ImageView) findViewById(R.id.profile_pic);

//        initializing the textViews for the various texts in the profile-activity.xml
        profile_name = (TextView) findViewById(R.id.profile_name);
        track = (TextView) findViewById(R.id.track_txt);
        country = (TextView) findViewById(R.id.country_txt);
        email = (TextView) findViewById(R.id.email_txt);
        phoneNumber = (TextView) findViewById(R.id.phone_number_txt);
        slackUsername = (TextView) findViewById(R.id.slack_usn_txt);

//        initializing the View for the divider in the profile-activity.xml
        divider = (View) findViewById(R.id.divider);
    }
}
