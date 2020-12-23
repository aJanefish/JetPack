package com.example.jetpack;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.jetpack.lifecycle.MyActivityObserver;
import com.example.jetpack.lifecycle.MyLifecycleService;

/**
 * JetPack学习
 */
public class MainActivity extends AppCompatActivity {

    private String TAG = "zhangyu1129";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getLifecycle().addObserver(new MyActivityObserver());
    }

    @Override
    protected void onResume() {
        super.onResume();
        //Log.d(TAG, "onResume" + " " + Log.getStackTraceString(new Throwable()));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    public void startService(View view) {
        Intent intent = new Intent(this, MyLifecycleService.class);
        startService(intent);
    }

    public void stopService(View view) {
        Intent intent = new Intent(this, MyLifecycleService.class);
        stopService(intent);
    }

    public void startActivity(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void showClass(View view) {
        ClassLoader loader = MainActivity.class.getClassLoader();
        while (loader != null) {
            Log.d("zhangyu",loader.toString());//1
            loader = loader.getParent();
        }
        view.invalidate();
        view.requestLayout();
    }
}