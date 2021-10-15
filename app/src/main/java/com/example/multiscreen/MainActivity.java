package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name;

    //this is key @EXTRA_NAME for this activity
    //a key can be any String
    public static final String EXTRA_NAME="com.example.multiscreen.extra.NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //onClick set in Xml File
    public void send(View view){
        //log message to check weather funtion is being called or not
        Log.v("MainActivity","going to second  activity");

        //intet set to go to second screeen
        Intent intent=new Intent(this,MainActivity2.class);
        name= findViewById(R.id.editTextTextPersonName);
        String nameText=name.getText().toString();

        //key for this in Activity, Second argument is nameText which will be printed in second Activity
        intent.putExtra(EXTRA_NAME,nameText);
        //starts the activity
        startActivity(intent);
    }
}