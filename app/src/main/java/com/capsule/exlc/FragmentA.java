package com.capsule.exlc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import capsule.bamboo.Logger;

public class FragmentA extends BaseFragment {

  public static FragmentA newInstance() {
    Bundle args = new Bundle();
    FragmentA fragment = new FragmentA();
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
    View view = inflater.inflate(R.layout.fragment_a, container, false);
    return view;
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);
    setOnClick(view);
  }

  private void setOnClick(View view) {
    view.<TextView>findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        FragmentB fragment = FragmentB.newInstance();
        getActivity().getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, fragment, "fragmentB")
            .addToBackStack("fragmentB").commit();
      }
    });
  }


  @Override
  public void onSaveInstanceState(Bundle outState) {
    super.onSaveInstanceState(outState);
    String data = "save some data";
    Logger.i("保存数据:" + data);
    outState.putString("key", data);
  }


}
