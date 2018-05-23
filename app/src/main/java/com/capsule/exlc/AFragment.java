package com.capsule.exlc;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import capsule.bamboo.Logger;

public class AFragment extends LifecycleLogFragment {

    public static AFragment newInstance() {
        Bundle args = new Bundle();
        AFragment fragment = new AFragment();
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
                BFragment fragment = BFragment.newInstance();
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
