package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle","onCreate1");
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openActivity2();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle","onStart1");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle","onResume1");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle","onPause1");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle","onStop1");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle","onDestroy1");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Lifecycle","onRestart1");
    }
    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}