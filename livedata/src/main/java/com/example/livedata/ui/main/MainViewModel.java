package com.example.livedata.ui.main;


import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class MainViewModel extends ViewModel {
    private String TAG = this.getClass().getName();

    MutableLiveData<Integer> progress = new MutableLiveData<>();

    public MutableLiveData<Integer> getProgress() {
        return progress;
    }

    /**
     * 由于屏幕旋转导致的Activity重建，该方法不会被调用
     * <p>
     * 只有ViewModel已经没有任何Activity与之有关联，系统则会调用该方法，你可以在此清理资源
     */
    @Override
    protected void onCleared() {
        super.onCleared();
        Log.d(TAG, "onCleared()");
    }
}