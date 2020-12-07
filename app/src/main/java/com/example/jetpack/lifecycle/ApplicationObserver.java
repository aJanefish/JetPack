package com.example.jetpack.lifecycle;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class ApplicationObserver implements LifecycleObserver {
    private final static String TAG = ApplicationObserver.class.getName();


    /**
     * 在应用的整个生命周期中只会调用一次
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    private void onCreate() {
        Log.d(TAG, "onCreate");
    }


    /**
     * 当应用程序在前台出现时被调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    private void onStart() {
        Log.d(TAG, "onStart");
    }


    /**
     * 当应用程序在前台出现时被调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    private void onResume() {
        Log.d(TAG, "onResume");
    }


    /**
     * 当应用程序退出到后台时被调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    private void onPause() {
        Log.d(TAG, "onPause");
    }

    /**
     * 当应用程序退出到后台时被调用
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    private void onStop() {
        Log.d(TAG, "onStop");
    }


    /**
     * 永远不会调用，系统不会分发调用ON_DESTROY事件
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        Log.d(TAG, "onDestroy");
    }

}
