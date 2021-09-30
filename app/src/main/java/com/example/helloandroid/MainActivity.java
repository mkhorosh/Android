package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bRun;
    EditText eName;

    public static final String key = "KEY_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(getApplicationContext(),"onCreate() called !",Toast.LENGTH_LONG).show();
        bRun = findViewById(R.id.bRun);
        eName = findViewById(R.id.name);
        bRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OtherActivity.class);
                intent.putExtra(key, eName.getText().toString());
                startActivityForResult(intent,0);
                finish();
            }
        });
    }

}