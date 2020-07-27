package com.capsule.exlc;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;

public abstract class BaseActivity extends AppCompatActivity {

  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.v("lifecycle-" + getClass().getSimpleName(), "onCreate()");
  }

  @Override
  protected void onRestart() {
    super.onRestart();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onRestart()");
  }

  @Override
  protected void onStart() {
    super.onStart();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onStart()");
  }

  @Override
  protected void onRestoreInstanceState(Bundle savedInstanceState) {
    super.onRestoreInstanceState(savedInstanceState);
    Log.v("lifecycle-" + getClass().getSimpleName(), "onRestoreInstanceState()");
  }

  @Override
  protected void onPostCreate(@Nullable Bundle savedInstanceState) {
    super.onPostCreate(savedInstanceState);
  }

  @Override
  protected void onResume() {
    super.onResume();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onResume()");
  }

  @Override
  protected void onPostResume() {
    super.onPostResume();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onPostResume()");
  }

  @Override
  public void onWindowFocusChanged(boolean hasFocus) {
    super.onWindowFocusChanged(hasFocus);
    if (hasFocus) {
      Log.w("lifecycle-" + getClass().getSimpleName(), "onWindowFocusChanged() : hasFocus");
    }
  }

  @Override
  protected void onPause() {
    super.onPause();
    Log.v("lifecycle-" + getClass().getSimpleName(), "onPause()");
  }

  @Override
  protected void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    Log.v("lifecycle-" + getClass().getSimpleName(), "onSaveInstanceState()");
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





}
