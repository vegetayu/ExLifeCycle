package com.capsule.exlc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentB extends BaseFragment {
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
      Log.i("lifecycle-" + getClass().getSimpleName(),"恢复数据:" + name);
    }
    View view = inflater.inflate(R.layout.fragment_b, container, false);
    return view;
  }

  @Override
  public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    String data = "save some data";
    Log.i("lifecycle-" + getClass().getSimpleName(),"保存数据:" + data);
    outState.putString("key", data);
  }


}
