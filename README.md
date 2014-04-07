Avoid - Android Innovative App
================
* `JDK1.7.0_03` / `Android 2.3.4 Gingerbread(API Level:10)` on Kindle Fire
* `Width:600px, Height:1024px`

Introduction
================
* Avoid is an app which provides different acne cure suggestions based on the position users touch. 
* Using [MotionEvent](http://developer.android.com/reference/android/view/MotionEvent.html) to get the exact position. 
* Avoid seperates a face image into 7 areas for tapping.
* To try this app, please `download avoid.apk` from the master directory.

================
  Refactoring Issue Solution:
* Based on different screen density of devices, it will not be used [getX(int)](http://developer.android.com/reference/android/view/MotionEvent.html#getX(int)) & [getY(int)](http://developer.android.com/reference/android/view/MotionEvent.html#getY(int));
* Instead, The screen issue can be solved by: designing a touch event for a base dpi(dots per inch);
setting up a custom touch handler class to get the device screen density, for example: `160 dpi return 1, 480 return 1.5`, using a formula similar to `pixel = (int)(pixel*density)` when taking the touch point, getting the XY coordinate exactly.


