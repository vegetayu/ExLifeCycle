package com.capsule.exlc

import android.app.Activity
import android.app.ActivityManager
import android.app.Application
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.util.Log

class MyApplication : Application() {
  override fun onCreate() {
    super.onCreate()
    registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
      private var lastPause: String? = null
      override fun onActivityPaused(activity: Activity?) {
        if (activity?.componentName?.shortClassName?.contains("ActivityB") == true) {
          lastPause = activity.componentName?.shortClassName
          Log.e("vegeta", "close B")
        }
      }

      override fun onActivityResumed(activity: Activity?) {
      }

      override fun onActivityStarted(activity: Activity?) {
        if (lastPause == ".ActivityB") {
          if (activity?.componentName?.shortClassName?.contains("ActivityA") == true) {
            Log.e("vegeta", "return from B")
          }
        }
        lastPause = null
      }

      override fun onActivityDestroyed(activity: Activity?) {
      }

      override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {

      }

      override fun onActivityStopped(activity: Activity?) {
      }

      override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
      }
    })
  }

  private fun printCurrentActivityName() {
    val am = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
      val appTasks = am.appTasks
      val taskInfo = appTasks[0].taskInfo
      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
//        var topActivity: ComponentName? = null
        val topActivity = taskInfo.topActivity
        Log.i("lifecycle-当前top", "" + topActivity?.className)
      }
    }
  }

}