package com.capsule.exlc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import capsule.bamboo.Logger;


public class ActivityB extends BaseActivity {

  private Fragment fragment = null;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_second);

    FragmentManager fm = getSupportFragmentManager();

    if (savedInstanceState == null) {
      fragment = FragmentA.newInstance();
      fm.beginTransaction().
          add(R.id.fragment_container, fragment, "fragmentA").
          addToBackStack("fragmentA").
          commit();
    } else {
//            fragment = fm.findFragmentByTag("fragmentA");
      if (fragment == null) {
        Logger.e("fragment is null");
      }
    }

  }

}
