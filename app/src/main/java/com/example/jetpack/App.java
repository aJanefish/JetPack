package com.example.jetpack;

import android.app.Application;

import androidx.lifecycle.ProcessLifecycleOwner;

import com.example.jetpack.lifecycle.ApplicationObserver;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new ApplicationObserver());
    }
}
