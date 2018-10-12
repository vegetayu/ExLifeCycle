package com.capsule.exlc;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;

public class ActivityA extends BaseActivity {

  private AlertDialog alertDialog;

  Button btn;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    alertDialog = new AlertDialog.Builder(this).setTitle("hello").setNegativeButton("cancel",
        new DialogInterface.OnClickListener() {
          @Override
          public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
          }
        }).setPositiveButton("ok", new DialogInterface.OnClickListener() {
      @Override
      public void onClick(DialogInterface dialog, int which) {
        dialog.dismiss();
      }
    }).create();

    btn = findViewById(R.id.btnStart);
    btn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        startActivity(new Intent(ActivityA.this, ActivityB.class));
      }
    });

//        btn.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                if (!alertDialog.isShowing()) {
//                    alertDialog.show();
//                }
//            }
//        }, 3000);

  }


}
