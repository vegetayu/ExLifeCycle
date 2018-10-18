package com.capsule.exlc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityA extends BaseActivity {

  Button btnStart;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_a);
    setTitle("Activity A");


    btnStart = findViewById(R.id.btnStart);
    btnStart.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(ActivityA.this, ActivityB.class));
      }
    });

    Button btn1 = findViewById(R.id.btn1);
    btn1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        DialogA dialog = new DialogA(ActivityA.this);
        dialog.show();
      }
    });

    Button btn2 = findViewById(R.id.btn2);
    btn2.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        new AlertDialog.Builder(ActivityA.this)
            .setTitle("title")
            .setMessage("this is the content")
            .create()
            .show();
      }
    });

  }

//  @Override
//  protected void onResume() {
//    super.onResume();
//    Log.e("vegeta", " onResume()  ---- button width : "+ btnStart.getWidth());
//  }
//
//  @Override
//  protected void onPostResume() {
//    super.onPostResume();
//    Log.e("vegeta", " onPostResume()  ---- button width : "+ btnStart.getWidth());
//  }
//
//  @Override
//  public void onWindowFocusChanged(boolean hasFocus) {
//    super.onWindowFocusChanged(hasFocus);
//    if (hasFocus) {
//      Log.e("vegeta", " onWindowFocusChanged()  ---- button width : "+ btnStart.getWidth());
//    }
//  }
}
