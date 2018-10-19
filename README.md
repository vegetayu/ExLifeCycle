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

6. ActivityA start ActivityB时

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

1. 生命周期方法调用顺序

在Activity的onCreate()中添加一个Fragment到界面上:
```
  Activity --> onCreate()
Fragment --> onAttach()
Fragment --> onCreate()
Fragment --> onViewCreated()
Fragment --> onActivityCreated()
Fragment --> onStart()
  Activity --> onStart()
  Activity --> onResume()
Fragment --> onResume()
```
2. 保持实例

在Fragment中调用`setRetainInstance()`方法,可以使Activity重建时,Fragment生命周期有所不同:
- (1) `onDestroy()`不会在Activity被意外回收时调用,但是会调用`onDetach()`.
- (2) `onCreate()`不会在Activity重建时调用,但是会调用`onAttach()`.

简而言之,就是在Activity重建过程中,保持Fragment实例不被销毁重建.

3. onSaveInstanceState()会在依附的Activity保存状态时被调用,即单纯地replace()时,Fragment不会保存状态.

4. show()和hide()方法不会触发Fragment的生命周期方法.

