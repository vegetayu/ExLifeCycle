## Activity与Fragment生命周期

### Activity

1. 相关方法的调用顺序
```
onCreate()
onRestart()
onStart()
 onRestoreInstanceState()
 onPostCreate()
onResume()
 onPostResume()
 onWindowFocusChanged() //不止调用一次
onPause()
 onSaveInstanceState()
onStop()
onDestroy()
```
2. 持久化方法

`onCreate()` `onPostCreate()` `onSaveInstanceState()` `onRestoreInstanceState()`分别都有对应的带两个参数的回调方法,作用是持久化保存状态信息.

3. Activity的`onSaveInstanceState()`总是在`onStop()`之前调用
4. 在`onWindowFocusChanged()`方法中,能直接获取View的宽高.
5. 弹出Dialog/AlertDialog不影响Activity生命周期

6. ActivityA start ActivityB时的生命周期:

```
ActivityA --> onCreate()
ActivityA --> onStart()
ActivityA --> onResume()
ActivityA --> onPause()
  ActivityB --> onCreate()
  ActivityB --> onStart()
  ActivityB --> onResume()
ActivityA --> onSaveInstanceState()
ActivityA --> onStop()
```

### Fragment

