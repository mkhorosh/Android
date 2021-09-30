package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(),"onCreate() called !",Toast.LENGTH_LONG).show();
        };

    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(),"onStart() called !",Toast.LENGTH_LONG).show();
    }
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(),"onPause() called !",Toast.LENGTH_LONG).show();
    }
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(),"onRestart() called !",Toast.LENGTH_LONG).show();
    }
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(),"onResume() called !",Toast.LENGTH_LONG).show();
    }
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(),"onStop() called !",Toast.LENGTH_LONG).show();
    }
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(),"onDestroy() called !",Toast.LENGTH_LONG).show();
    }
}