package com.android.example.birthdaycard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * This activity is the activity for the Birthday Card App.
 *
 * Note that this version uses AppCompatActivity, which is slightly different from the filmed
 * version used in the videos for Android Development for Beginners. The old version used the
 * now deprecated ActionBarActivity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView (R.layout.activity_main);

    }

}
