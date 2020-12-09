package com.example.databindingdemo.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.databindingdemo.R;

public class RecyclerViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        Log.d("zhangyu1209", Log.getStackTraceString(new Throwable()));

        //        at com.example.databindingdemo.activity.RecyclerViewActivity.onCreate(RecyclerViewActivity.java:17)
        //        at android.app.Activity.performCreate(Activity.java:7136)
        //        at android.app.Activity.performCreate(Activity.java:7127)
        //        at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1271)
        //        at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2893)
        //        at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3048)
        //        at android.app.servertransaction.LaunchActivityItem.execute(LaunchActivityItem.java:78)
        //        at android.app.servertransaction.TransactionExecutor.executeCallbacks(TransactionExecutor.java:108)
        //        at android.app.servertransaction.TransactionExecutor.execute(TransactionExecutor.java:68)
        //        at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1808)
        //        at android.os.Handler.dispatchMessage(Handler.java:106)
        //        at android.os.Looper.loop(Looper.java:193)
        //        at android.app.ActivityThread.main(ActivityThread.java:6669)
        //        at java.lang.reflect.Method.invoke(Native Method)
        //        at com.android.internal.os.RuntimeInit$MethodAndArgsCaller.run(RuntimeInit.java:493)
        //        at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:858)
    }
}