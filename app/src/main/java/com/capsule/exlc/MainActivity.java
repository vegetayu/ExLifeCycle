package com.capsule.exlc;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import capsule.bamboo.Logger;

public class MainActivity extends AppCompatActivity {

    private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Logger.v("vegeta", "onCreate");

        alertDialog = new AlertDialog.Builder(this)
                .setTitle("hello")
                .setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();

        findViewById(R.id.btnStart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondActivity.class));
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Logger.v("vegeta", "onStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Logger.v("vegeta", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Logger.v("vegeta", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Logger.v("vegeta", "onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Logger.v("vegeta", "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Logger.v("vegeta", "onResume");

        if (!alertDialog.isShowing()) {
//            alertDialog.show();

        }
    }


}
