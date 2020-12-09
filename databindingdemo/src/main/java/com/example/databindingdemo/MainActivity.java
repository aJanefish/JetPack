package com.example.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.databindingdemo.activity.DataBindingClickActivity;
import com.example.databindingdemo.activity.DataBindingMainActivity;
import com.example.databindingdemo.activity.DiyActivity;
import com.example.databindingdemo.activity.OtherActivity;
import com.example.databindingdemo.activity.RecyclerViewActivity;
import com.example.databindingdemo.activity.TwoActivity;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test1(View view) {
        startActivity(new Intent(this, DataBindingMainActivity.class));
    }

    public void test2(View view) {
        startActivity(new Intent(this, DataBindingClickActivity.class));
    }

    //页面多层级嵌套传递数据
    public void test3(View view) {
        startActivity(new Intent(this, OtherActivity.class));
    }

    public void test4(View view) {
        startActivity(new Intent(this, DiyActivity.class));
    }

    public void test5(View view) {
        startActivity(new Intent(this, TwoActivity.class));
    }

    //RecyclerView的绑定机制
    public void test6(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        //     Caused by: android.os.TransactionTooLargeException: data parcel size 1049036 bytes
        //        at android.os.BinderProxy.transactNative(Native Method)
        //        at android.os.BinderProxy.transact(Binder.java:1127)
        //        at android.app.IActivityManager$Stub$Proxy.startActivity(IActivityManager.java:3754)
        //byte[] bytes = new byte[1024 * 1024];

        //Caused by: android.os.TransactionTooLargeException: data parcel size 1040844 bytes
        //byte[] bytes = new byte[1024 * 1024 - 2 * 4096];

        //    android.os.TransactionTooLargeException: data parcel size 1011236 bytes
        //        at android.os.BinderProxy.transactNative(Native Method)
        //        at android.os.BinderProxy.transact(Binder.java:1127)
        //        at android.app.IApplicationThread$Stub$Proxy.scheduleTransaction(IApplicationThread.java:1777)
        //        at android.app.servertransaction.ClientTransaction.schedule(ClientTransaction.java:129)
        //        at com.android.server.am.ClientLifecycleManager.scheduleTransaction(ClientLifecycleManager.java:47)
        //        at com.android.server.am.ActivityStackSupervisor.realStartActivityLocked(ActivityStackSupervisor.java:1545)
        //        at com.android.server.am.ActivityStackSupervisor.attachApplicationLocked(ActivityStackSupervisor.java:989)
        //        at com.android.server.am.ActivityManagerService.attachApplicationLocked(ActivityManagerService.java:7872)
        //        at com.android.server.am.ActivityManagerService.attachApplication(ActivityManagerService.java:7940)
        //        at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:198)
        //        at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3291)
        //        at android.os.Binder.execTransact(Binder.java:731)
        //byte[] bytes = new byte[1024 * 1024 - 10 * 4096];


        //byte[] bytes = new byte[1024 * 1024 - 20 * 4096];
        //    android.os.TransactionTooLargeException: data parcel size 970276 bytes
        //        at android.os.BinderProxy.transactNative(Native Method)
        //        at android.os.BinderProxy.transact(Binder.java:1127)
        //        at android.app.IApplicationThread$Stub$Proxy.scheduleTransaction(IApplicationThread.java:1777)
        //        at android.app.servertransaction.ClientTransaction.schedule(ClientTransaction.java:129)
        //        at com.android.server.am.ClientLifecycleManager.scheduleTransaction(ClientLifecycleManager.java:47)
        //        at com.android.server.am.ActivityStackSupervisor.realStartActivityLocked(ActivityStackSupervisor.java:1545)
        //        at com.android.server.am.ActivityStackSupervisor.attachApplicationLocked(ActivityStackSupervisor.java:989)
        //        at com.android.server.am.ActivityManagerService.attachApplicationLocked(ActivityManagerService.java:7872)
        //        at com.android.server.am.ActivityManagerService.attachApplication(ActivityManagerService.java:7940)
        //        at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:198)
        //        at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3291)
        //        at android.os.Binder.execTransact(Binder.java:731)


        //byte[] bytes = new byte[1024 * 1024 - 100 * 1024];
        //    android.os.TransactionTooLargeException: data parcel size 949796 bytes
        //        at android.os.BinderProxy.transactNative(Native Method)
        //        at android.os.BinderProxy.transact(Binder.java:1127)
        //        at android.app.IApplicationThread$Stub$Proxy.scheduleTransaction(IApplicationThread.java:1777)
        //        at android.app.servertransaction.ClientTransaction.schedule(ClientTransaction.java:129)
        //        at com.android.server.am.ClientLifecycleManager.scheduleTransaction(ClientLifecycleManager.java:47)
        //        at com.android.server.am.ActivityStackSupervisor.realStartActivityLocked(ActivityStackSupervisor.java:1545)
        //        at com.android.server.am.ActivityStackSupervisor.attachApplicationLocked(ActivityStackSupervisor.java:989)
        //        at com.android.server.am.ActivityManagerService.attachApplicationLocked(ActivityManagerService.java:7872)
        //        at com.android.server.am.ActivityManagerService.attachApplication(ActivityManagerService.java:7940)
        //        at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:198)
        //        at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3291)
        //        at android.os.Binder.execTransact(Binder.java:731)


        //byte[] bytes = new byte[1024 * 1024 - 200 * 1024];
        //    android.os.TransactionTooLargeException: data parcel size 847396 bytes
        //        at android.os.BinderProxy.transactNative(Native Method)
        //        at android.os.BinderProxy.transact(Binder.java:1127)
        //        at android.app.IApplicationThread$Stub$Proxy.scheduleTransaction(IApplicationThread.java:1777)
        //        at android.app.servertransaction.ClientTransaction.schedule(ClientTransaction.java:129)
        //        at com.android.server.am.ClientLifecycleManager.scheduleTransaction(ClientLifecycleManager.java:47)
        //        at com.android.server.am.ActivityStackSupervisor.realStartActivityLocked(ActivityStackSupervisor.java:1545)
        //        at com.android.server.am.ActivityStackSupervisor.attachApplicationLocked(ActivityStackSupervisor.java:989)
        //        at com.android.server.am.ActivityManagerService.attachApplicationLocked(ActivityManagerService.java:7872)
        //        at com.android.server.am.ActivityManagerService.attachApplication(ActivityManagerService.java:7940)
        //        at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:198)
        //        at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3291)
        //        at android.os.Binder.execTransact(Binder.java:731)


        //byte[] bytes = new byte[1024 * 1024 - 400 * 1024];
        //    android.os.TransactionTooLargeException: data parcel size 642596 bytes
        //        at android.os.BinderProxy.transactNative(Native Method)
        //        at android.os.BinderProxy.transact(Binder.java:1127)
        //        at android.app.IApplicationThread$Stub$Proxy.scheduleTransaction(IApplicationThread.java:1777)
        //        at android.app.servertransaction.ClientTransaction.schedule(ClientTransaction.java:129)
        //        at com.android.server.am.ClientLifecycleManager.scheduleTransaction(ClientLifecycleManager.java:47)
        //        at com.android.server.am.ActivityStackSupervisor.realStartActivityLocked(ActivityStackSupervisor.java:1545)
        //        at com.android.server.am.ActivityStackSupervisor.attachApplicationLocked(ActivityStackSupervisor.java:989)
        //        at com.android.server.am.ActivityManagerService.attachApplicationLocked(ActivityManagerService.java:7872)
        //        at com.android.server.am.ActivityManagerService.attachApplication(ActivityManagerService.java:7940)
        //        at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:198)
        //        at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3291)
        //        at android.os.Binder.execTransact(Binder.java:731)


        //OK  byte[] bytes = new byte[1024 * 1024 - 800 * 1024];

        //OK byte[] bytes = new byte[1024 * 1024 - 600 * 1024];

        //OK byte[] bytes = new byte[1024 * 1024 - 500 * 1024];

        //byte[] bytes = new byte[1024 * 1024 - 450 * 1024];
        //    android.os.TransactionTooLargeException: data parcel size 540196 bytes
        //        at android.os.BinderProxy.transactNative(Native Method)
        //        at android.os.BinderProxy.transact(Binder.java:1127)
        //        at android.app.IApplicationThread$Stub$Proxy.scheduleTransaction(IApplicationThread.java:1777)
        //        at android.app.servertransaction.ClientTransaction.schedule(ClientTransaction.java:129)
        //        at com.android.server.am.ClientLifecycleManager.scheduleTransaction(ClientLifecycleManager.java:47)
        //        at com.android.server.am.ActivityStackSupervisor.realStartActivityLocked(ActivityStackSupervisor.java:1545)
        //        at com.android.server.am.ActivityStackSupervisor.attachApplicationLocked(ActivityStackSupervisor.java:989)
        //        at com.android.server.am.ActivityManagerService.attachApplicationLocked(ActivityManagerService.java:7872)
        //        at com.android.server.am.ActivityManagerService.attachApplication(ActivityManagerService.java:7940)
        //        at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:198)
        //        at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3291)
        //        at android.os.Binder.execTransact(Binder.java:731)


        //byte[] bytes = new byte[550 * 1024];
        //    android.os.TransactionTooLargeException: data parcel size 566820 bytes
        //        at android.os.BinderProxy.transactNative(Native Method)
        //        at android.os.BinderProxy.transact(Binder.java:1127)
        //        at android.app.IApplicationThread$Stub$Proxy.scheduleTransaction(IApplicationThread.java:1777)
        //        at android.app.servertransaction.ClientTransaction.schedule(ClientTransaction.java:129)
        //        at com.android.server.am.ClientLifecycleManager.scheduleTransaction(ClientLifecycleManager.java:47)
        //        at com.android.server.am.ActivityStackSupervisor.realStartActivityLocked(ActivityStackSupervisor.java:1545)
        //        at com.android.server.am.ActivityStackSupervisor.attachApplicationLocked(ActivityStackSupervisor.java:989)
        //        at com.android.server.am.ActivityManagerService.attachApplicationLocked(ActivityManagerService.java:7872)
        //        at com.android.server.am.ActivityManagerService.attachApplication(ActivityManagerService.java:7940)
        //        at android.app.IActivityManager$Stub.onTransact(IActivityManager.java:198)
        //        at com.android.server.am.ActivityManagerService.onTransact(ActivityManagerService.java:3291)
        //        at android.os.Binder.execTransact(Binder.java:731)


        //OK byte[] bytes = new byte[450 * 1024];

        //OK byte[] bytes = new byte[500 * 1024];

        //OK byte[] bytes = new byte[525 * 1024];

        //byte[] bytes = new byte[540 * 1024];
        //android.os.TransactionTooLargeException: data parcel size 541220 bytes

        //byte[] bytes = new byte[533 * 1024];
        //android.os.TransactionTooLargeException: data parcel size 549412 bytes


        //byte[] bytes = new byte[530 * 1024];
        //android.os.TransactionTooLargeException: data parcel size 546340 bytes

        //byte[] bytes = new byte[528 * 1024];
        //android.os.TransactionTooLargeException: data parcel size 544292 bytes

        //byte[] bytes = new byte[526 * 1024];
        //android.os.TransactionTooLargeException: data parcel size 542244 bytes

        //byte[] bytes = new byte[525 * 1024];
        //android.os.TransactionTooLargeException: data parcel size 541220 bytes

        //byte[] bytes = new byte[510 * 1024];
        //android.os.TransactionTooLargeException: data parcel size 525860 bytes

        //byte[] bytes = new byte[505 * 1024];
        //android.os.TransactionTooLargeException: data parcel size 520740 bytes

        byte[] bytes = new byte[505 * 1024];
        //OK byte[] bytes = new byte[504 * 1024];
        //OK byte[] bytes = new byte[503 * 1024];

        //OK byte[] bytes = new byte[502 * 1024];

        // OK byte[] bytes = new byte[500 * 1024];

        Arrays.fill(bytes, (byte) 1);
        intent.putExtra("test", bytes);
        startActivity(intent);
    }
}