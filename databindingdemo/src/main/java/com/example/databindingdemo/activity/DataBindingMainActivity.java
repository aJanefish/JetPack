package com.example.databindingdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.view.View;

import com.example.databindingdemo.BR;
import com.example.databindingdemo.R;
import com.example.databindingdemo.data.Book;

public class DataBindingMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.data_binding_main_activity);
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container, DataBindingMainFragment.newInstance())
//                    .commitNow();
//        }

        //2.
        if (true) {
//            DataBindingMainActivityBindingImpl dataBindingMainActivityBinding = DataBindingUtil.setContentView(this, R.layout.data_binding_main_activity);
//            Book book = new Book("我的世界", "zy");
//            dataBindingMainActivityBinding.setBook(book);
            ViewDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.data_binding_main_activity);
            Book book = new Book("我的世界", "zy");
            dataBinding.setVariable(BR.book, book);
            flag = false;
        } else {
            ViewDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.data_binding_main_activity);
            Book book = new Book("我的世界", "zy");
            dataBinding.setVariable(BR.book, book);
            flag = true;
        }
    }

    boolean flag = true;

    public void exchangeData(View view) {
        if (flag) {
//            DataBindingMainActivityBindingImpl dataBindingMainActivityBinding = DataBindingUtil.setContentView(this, R.layout.data_binding_main_activity);
//            Book book = new Book("我的世界1", "zy1");
//            dataBindingMainActivityBinding.setBook(book);
            ViewDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.data_binding_main_activity);
            Book book = new Book("我的世界2", "zy2");
            dataBinding.setVariable(BR.book, book);
        } else {
            ViewDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.data_binding_main_activity);
            Book book = new Book("我的世界2", "zy2");
            dataBinding.setVariable(BR.book, book);
        }

        flag = !flag;
    }
}