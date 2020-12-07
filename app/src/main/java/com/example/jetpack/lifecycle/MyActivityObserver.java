package com.example.jetpack.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import android.util.Log;

/**
 * Activity和Fragment
 */
public class MyActivityObserver implements LifecycleObserver {

    private static final String TAG = MyActivityObserver.class.getName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void workOnCreate() {
        Log.d(TAG, "workOnCreate");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void workOnStart() {
        Log.d(TAG, "workOnStart");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    private void workOnAny() {
        //Log.d(TAG, "workOnAny");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void workOnResume() {
        //Log.d(TAG, "workOnResume " + Thread.currentThread() + " " + Log.getStackTraceString(new Throwable()));
        Log.d(TAG, "workOnResume");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void workOnPause() {
        Log.d(TAG, "workOnPause");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void workOnStop() {
        Log.d(TAG, "workOnStop");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void workOnDestroy() {
        Log.d(TAG, "workOnDestroy");
    }
}
