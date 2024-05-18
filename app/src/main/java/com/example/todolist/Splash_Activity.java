package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.provider.CalendarContract;
import android.util.Log;
import android.widget.Toast;

public class Splash_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

       getWindow().setStatusBarColor(Color.parseColor("#ffe2d0"));



        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(Splash_Activity.this, "Welcome", Toast.LENGTH_SHORT).show();
                Log.e("TAG", "run: Wel come to the page");
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
                finish();

            }
        },5000);
    }
}