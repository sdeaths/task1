package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("testLogs", "onCreate");
        Log.e("testLogs", "onCreate");
        Log.i("testLogs", "onCreate");
        Log.v("testLogs", "onCreate");
        Log.w("testLogs", "onCreate");

        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("testLogs", "onStart");
        Log.e("testLogs", "onStart");
        Log.i("testLogs", "onStart");
        Log.v("testLogs", "onStart");
        Log.w("testLogs", "onStart");

        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("testLogs", "onResume");
        Log.e("testLogs", "onResume");
        Log.i("testLogs", "onResume");
        Log.v("testLogs", "onResume");
        Log.w("testLogs", "onResume");

        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("testLogs", "onPause");
        Log.e("testLogs", "onPause");
        Log.i("testLogs", "onPause");
        Log.v("testLogs", "onPause");
        Log.w("testLogs", "onPause");

        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("testLogs", "onStop");
        Log.e("testLogs", "onStop");
        Log.i("testLogs", "onStop");
        Log.v("testLogs", "onStop");
        Log.w("testLogs", "onStop");

        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("testLogs", "onDestroy");
        Log.e("testLogs", "onDestroy");
        Log.i("testLogs", "onDestroy");
        Log.v("testLogs", "onDestroy");
        Log.w("testLogs", "onDestroy");

        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("testLogs", "onRestart");
        Log.e("testLogs", "onRestart");
        Log.i("testLogs", "onRestart");
        Log.v("testLogs", "onRestart");
        Log.w("testLogs", "onRestart");

        Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
}