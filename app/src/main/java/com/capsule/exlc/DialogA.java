package com.capsule.exlc;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;

public class DialogA extends Dialog {
  public DialogA(@NonNull Context context) {
    super(context);
  }

  public DialogA(@NonNull Context context, int themeResId) {
    super(context, themeResId);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.dialog_a);
  }
}
