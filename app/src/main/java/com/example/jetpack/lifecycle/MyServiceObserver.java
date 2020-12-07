package com.example.jetpack.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import android.util.Log;

public class MyServiceObserver implements LifecycleObserver {
    private static final String TAG = MyServiceObserver.class.getName();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void start() {
        Log.d(TAG, "start");
    }


    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void stop() {
        Log.d(TAG, "stop");
    }
}
