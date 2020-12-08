package com.example.room.database;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.room.dao.StudentDao;
import com.example.room.data.Student;

@Database(entities = {Student.class}, version = 1, exportSchema = true)
public abstract class MyDataBase extends RoomDatabase {

    private static final String DATABASE_NAME = "my_db";
    private static MyDataBase instance;

    public static synchronized MyDataBase getInstance(Context context) {
        if (instance == null) {
            instance = Room
                    .databaseBuilder(context.getApplicationContext(), MyDataBase.class, DATABASE_NAME)
                    .build();
        }
        return instance;
    }

    public abstract StudentDao studentDao();
}
