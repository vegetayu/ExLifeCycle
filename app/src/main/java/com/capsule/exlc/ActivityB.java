package com.capsule.exlc;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


public class ActivityB extends BaseActivity {

  private Fragment fragment = null;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_b);
    setTitle("Activity B");
    FragmentManager fm = getSupportFragmentManager();

    if (savedInstanceState == null) {
      fragment = FragmentA.newInstance();
      fm.beginTransaction().
          add(R.id.fragment_container, fragment, "fragmentA").
//          addToBackStack("fragmentA").
          commit();
    } else {
      fragment = fm.findFragmentByTag("fragmentA");
    }

  }




}
