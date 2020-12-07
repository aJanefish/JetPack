package com.example.jetpack.lifecycle;

import androidx.lifecycle.LifecycleService;

/**
 * 服务的生命周期
 */
public class MyLifecycleService extends LifecycleService {
    public MyLifecycleService() {
        getLifecycle().addObserver(new MyServiceObserver());
    }
}