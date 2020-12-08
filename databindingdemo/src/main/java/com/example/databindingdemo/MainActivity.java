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
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }
}