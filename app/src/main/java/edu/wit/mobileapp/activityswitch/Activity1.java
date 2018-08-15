package edu.wit.mobileapp.activityswitch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_1);

        Button activity1_btn = (Button)findViewById(R.id.activity1_button);
        activity1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Activity2.class);
                intent.putExtra("Jake", "21");
                startActivity(intent);
            }
        });
    }



}
