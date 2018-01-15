package com.capsule.exlc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import capsule.bamboo.Logger;


public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Logger.v("vegeta", "onCreate");

//        Intent intent = new Intent(this, MainActivity.class);
//        intent.setAction("helloo");
//        intent.addCategory("");
//        intent.setDataAndNormalize()

    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.v("vegeta", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.v("vegeta", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.v("vegeta", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.v("vegeta", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.v("vegeta", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.v("vegeta", "onResume");
    }
}
