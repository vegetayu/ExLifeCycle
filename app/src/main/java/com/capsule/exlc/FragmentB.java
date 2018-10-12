package com.capsule.exlc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import capsule.bamboo.Logger;

public class FragmentB extends Fragment {
  public static FragmentB newInstance() {
    Bundle args = new Bundle();
    FragmentB fragment = new FragmentB();
    fragment.setArguments(args);
    return fragment;
  }

  @Nullable
  @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    if (null != savedInstanceState) {
      String name = savedInstanceState.getString("key");
      Logger.i("恢复数据:" + name);
    }
    View view = inflater.inflate(R.layout.fragment_b, container, false);
    return view;
  }

  @Override
  public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    String data = "save some data";
    Logger.i("保存数据:" + data);
    outState.putString("key", data);
  }


}
