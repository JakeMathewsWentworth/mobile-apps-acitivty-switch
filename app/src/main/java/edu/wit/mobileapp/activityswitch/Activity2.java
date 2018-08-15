package edu.wit.mobileapp.activityswitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_2);
        Log.v("Activity1 Sent", getIntent().getStringExtra("Jake"));
    }
}
