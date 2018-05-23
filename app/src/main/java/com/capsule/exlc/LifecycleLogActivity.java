package com.capsule.exlc;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import capsule.bamboo.Logger;

public abstract class LifecycleLogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.v(getClass().getSimpleName());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Logger.v(getClass().getSimpleName());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Logger.v(getClass().getSimpleName());
    }
}
