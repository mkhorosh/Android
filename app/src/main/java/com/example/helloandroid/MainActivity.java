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

    Button bRun;
    private static final int SHOW_OTHER_ACTIVITY = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Toast.makeText(getApplicationContext(),"onCreate() called !",Toast.LENGTH_LONG).show();
        bRun = findViewById(R.id.bRun);
        bRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), OtherActivity.class);
//                intent.putExtra(OtherActivity.GUESS,"Some guess");
//                startActivityForResult(intent,SHOW_OTHER_ACTIVITY);

//                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
//                browserIntent.setData(Uri.parse("http://www.google.com"));
//                browserIntent.addCategory(Intent.CATEGORY_BROWSABLE);
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:0123456789"));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }


//                finish();

            }
        });
    }

    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case (SHOW_OTHER_ACTIVITY):
                if (resultCode == Activity.RESULT_OK){
                    boolean isCorrect = data.getBooleanExtra(OtherActivity.IS_CORRECT, false);
                    if (isCorrect){
                        String str = getIntent().getStringExtra("KEY_NAME");
                        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
                    }else{
                        super.onActivityResult(requestCode, resultCode, data);
                    }
                }
                break;
        }
    }


//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(getApplicationContext(),"onStart() called !",Toast.LENGTH_LONG).show();
//    }
//    protected void onPause() {
//        super.onPause();
//        Toast.makeText(getApplicationContext(),"onPause() called !",Toast.LENGTH_LONG).show();
//    }
//    protected void onRestart() {
//        super.onRestart();
//        Toast.makeText(getApplicationContext(),"onRestart() called !",Toast.LENGTH_LONG).show();
//    }
//    protected void onResume() {
//        super.onResume();
//        Toast.makeText(getApplicationContext(),"onResume() called !",Toast.LENGTH_LONG).show();
//    }
//    protected void onStop() {
//        super.onStop();
//        Toast.makeText(getApplicationContext(),"onStop() called !",Toast.LENGTH_LONG).show();
//    }
//    protected void onDestroy() {
//        super.onDestroy();
//        Toast.makeText(getApplicationContext(),"onDestroy() called !",Toast.LENGTH_LONG).show();
//    }
}