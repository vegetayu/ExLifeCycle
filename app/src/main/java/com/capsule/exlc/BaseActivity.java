package com.capsule.exlc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.v("lifecycle-" + getClass().getSimpleName(), "onCreate()");
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onStart()");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onRestart()");
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onResume()");
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onPause()");
  }

  @Override
  protected void onStop() {
    super.onStop();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onStop()");
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onDestroy()");
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    Log.v("lifecycle-" + getClass().getSimpleName(), "onSaveInstanceState()");
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    Log.v("lifecycle-" + getClass().getSimpleName(), "onRestoreInstanceState()");
  }
}
