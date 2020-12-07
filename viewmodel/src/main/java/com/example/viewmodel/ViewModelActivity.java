package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.viewmodel.ui.main.MainViewModel;
import com.example.viewmodel.ui.main.ViewModelFragment;

public class ViewModelActivity extends AppCompatActivity {
    private MainViewModel mViewModel;
    private TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_model_activity);
        title = findViewById(R.id.main_title);

        mViewModel = new ViewModelProvider(this).get(MainViewModel.class);
    }

    public void startClick(View view) {
        mViewModel.setOnTimeChangeListener(new MainViewModel.OnTimeChangeListener() {
            @Override
            public void onTimeChanged(String second) {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        title.setText(second);
                    }
                });
            }
        });

        mViewModel.startTiming();
    }
}