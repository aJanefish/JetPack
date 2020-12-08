package com.example.databindingdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;

import com.example.databindingdemo.data.Book;
import com.example.databindingdemo.ui.main.DataBindingMainFragment;

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
        ViewDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.data_binding_main_activity);
        Book book = new Book("我的世界", "zy");
        dataBinding.setVariable(BR.book, book);
    }
}