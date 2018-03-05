package com.example.tristan.todoliste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonCreateTask = (Button) findViewById(R.id.buttonCreateTask);
        buttonCreateTask.setOnClickListener(new OnClickListenerCreateTask());
    }
}
