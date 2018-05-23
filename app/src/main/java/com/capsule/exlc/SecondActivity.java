package com.capsule.exlc;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import capsule.bamboo.Logger;


public class SecondActivity extends LifecycleLogActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Fragment fragment = AFragment.newInstance();
        getSupportFragmentManager().beginTransaction()
                                   .add(R.id.fragment_container, fragment, "fragmentA")
                                   .addToBackStack("fragmentA")
                                   .commit();

    }

}
