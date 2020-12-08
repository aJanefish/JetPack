package com.example.databindingdemo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databindingdemo.BR;
import com.example.databindingdemo.R;
import com.example.databindingdemo.databinding.ActivityDataBindingClickBinding;

public class DataBindingClickActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_binding_click);
        //ViewDataBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_click);
        ActivityDataBindingClickBinding dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_click);
        //dataBinding.setVariable(BR.clickHandler, new EventHandler(this));
        dataBinding.setClickHandler(new EventHandler(this));
    }


    public static class EventHandler {

        private Context context;

        public EventHandler(Context context) {
            this.context = context;
        }

        public void onButtonClick(View view) {
            Toast.makeText(context, "I am Click! " + view, Toast.LENGTH_LONG).show();
        }
    }
}