package com.example.helloandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class OtherActivity extends AppCompatActivity {

    EditText eName;
    Button aRun;
    public static final String key = "KEY_NAME";
    private static final int SHOW_OTHER_ACTIVITY = 1;
    public static final String IS_CORRECT = "com.example.helloandroid.MainActivity.iscorrect";
    public static final String GUESS = "helloandroid.guess";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        eName = findViewById(R.id.name);
        aRun = findViewById(R.id.aRun);
        aRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra(key, eName.getText().toString());
//                intent.putExtra(IS_CORRECT,isCorrect(guess));
                setResult(RESULT_OK,intent);






//                startActivityForResult(intent,SHOW_OTHER_ACTIVITY);
                finish();
            }});
    }

}

