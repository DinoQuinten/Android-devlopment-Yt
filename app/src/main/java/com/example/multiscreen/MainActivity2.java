package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView greet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        greet=findViewById(R.id.greet);
        Intent intent=getIntent();

        //get is used to get data from the intent sender
        //arguments in getStringExtra is the name of activity who called intent while @EXTRA_NAME
        //is the name of key
        String name=intent.getStringExtra(MainActivity.EXTRA_NAM);
        greet.setText("hello, how are yout?\n"+name);
    }
}