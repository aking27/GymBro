package com.example.gymbro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button addDay;
    Button profile;
    Button settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addDay = (Button) findViewById(R.id.addDay);
        profile = (Button) findViewById(R.id.profile);
        settings = (Button) findViewById(R.id.settings);

//        addDay.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(getApplicationContext(), ClientUserActivity.class));
//            }
//        });
    }
}
