package com.example.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.room.ui.main.RoomMainFragment;

public class RoomMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, RoomMainFragment.newInstance())
                    .commitNow();
        }
    }
}