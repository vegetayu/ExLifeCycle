package com.capsule.exlc;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;


public abstract class BaseFragment extends Fragment {

  @Override
  public void onAttach(Context context) {
    super.onAttach(context);
    Log.i("lifecycle-" + getClass().getSimpleName(), "onAttach()");
  }

  @Override
  public void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Log.i("lifecycle-" + getClass().getSimpleName(), "onCreate()");
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    Log.i("lifecycle-" + getClass().getSimpleName(), "onViewCreated()");
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    Log.i("lifecycle-" + getClass().getSimpleName(), "onActivityCreated()");
  }

  @Override
  public void onStart() {
    super.onStart();
    Log.i("lifecycle-" + getClass().getSimpleName(), "onStart()");
  }

  @Override
  public void onResume() {
    super.onResume();
    Log.i("lifecycle-" + getClass().getSimpleName(), "onResume()");
  }

  @Override
  public void onPause() {
    super.onPause();
    Log.i("lifecycle-" + getClass().getSimpleName(), "onPause()");
  }

  @Override
  public void onStop() {
    super.onStop();
    Log.i("lifecycle-" + getClass().getSimpleName(), "onStop()");
  }

  @Override
  public void onDestroyView() {
    super.onDestroyView();
    Log.i("lifecycle-" + getClass().getSimpleName(), "onDestroyView()");
  }

  @Override
  public void onDestroy() {
    super.onDestroy();
    Log.i("lifecycle-" + getClass().getSimpleName(), "onDestroy()");
  }

  @Override
  public void onDetach() {
    super.onDetach();
    Log.i("lifecycle-" + getClass().getSimpleName(), "onDetach()");
  }

  @Override
  public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    Log.i("lifecycle-" + getClass().getSimpleName(), "onSaveInstanceState()");
  }

}
