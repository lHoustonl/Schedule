package com.example.schedule;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScheduleBlankFragment scheduleBlankFragment = (ScheduleBlankFragment)getSupportFragmentManager().findFragmentById(R.id.BlankEditText);

        scheduleBlankFragment.setGroup("4пк1");
    }
}