package com.capsule.exlc;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import capsule.bamboo.Logger;

public abstract class LifecycleLogFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.v(getClass().getSimpleName());
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        Logger.v(getClass().getSimpleName());
        return null;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onStart() {
        super.onStart();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onResume() {
        super.onResume();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onPause() {
        super.onPause();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onStop() {
        super.onStop();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Logger.v(getClass().getSimpleName());
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Logger.v(getClass().getSimpleName());
    }
}
