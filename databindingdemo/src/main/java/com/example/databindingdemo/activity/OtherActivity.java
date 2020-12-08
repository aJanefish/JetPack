package com.example.databindingdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.os.Bundle;
import android.view.View;

import com.example.databindingdemo.BR;
import com.example.databindingdemo.R;
import com.example.databindingdemo.data.Book;
import com.example.databindingdemo.databinding.ActivityOtherBinding;
import com.example.databindingdemo.databinding.DataBindingMainActivityBindingImpl;

public class OtherActivity extends AppCompatActivity {

    private ActivityOtherBinding dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        //ViewDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_other);
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_other);
        if (true) {
            Book book = new Book("我的世界", "zy");
            dataBinding.setBook(book);
            flag = false;
        } else {
            Book book = new Book("我的世界", "zy");
            dataBinding.setVariable(BR.book, book);
            flag = true;
        }
    }

    boolean flag = true;

    public void exchangeData(View view) {
        if (flag) {
            Book book = new Book("我的世界1", "zy1");
            dataBinding.setBook(book);
        } else {
            Book book = new Book("我的世界2", "zy2");
            dataBinding.setBook(book);
        }

        flag = !flag;
    }
}