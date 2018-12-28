package com.group13.mytask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button profileActivityBut = findViewById(R.id.profileActivityBut);
        profileActivityBut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), ProfilesActivity.class);
                startActivity(startIntent);
            }
        });

        Button triggerActivityBut = findViewById(R.id.triggerActivityBut);
        triggerActivityBut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), TriggerActivity.class);
                startActivity(startIntent);
            }
        });
    }
}
