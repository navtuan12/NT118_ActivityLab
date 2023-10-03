package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("Lifecycle","onCreate2");
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity1();
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","onStart2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","onResume2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","onPause2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","onStop2");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","onDestroy2");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle","onRestart2");
    }

    public void openActivity1(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}