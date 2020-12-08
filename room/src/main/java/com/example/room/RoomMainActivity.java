package com.example.room;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.room.data.Student;
import com.example.room.database.MyDataBase;
import com.example.room.ui.main.RoomMainFragment;

import java.util.List;

public class RoomMainActivity extends AppCompatActivity {

    private static final String TAG = "zy.RoomMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.room_main_activity);
//        if (savedInstanceState == null) {
//            getSupportFragmentManager().beginTransaction()
//                    .replace(R.id.container, RoomMainFragment.newInstance())
//                    .commitNow();
//        }
    }

    private void show() {
        //不能直接在UI线程操作
        MyDataBase myDataBase = MyDataBase.getInstance(this);
        myDataBase.studentDao().insertStudent(new Student("ZY", "28"));
        myDataBase.studentDao().updateStudent(new Student(1, "ZY", "28-1"));
        myDataBase.studentDao().deleteStudent(new Student(1, "ZY", "28-1"));
        Student student = myDataBase.studentDao().getStudentById(1);
        List<Student> students = myDataBase.studentDao().queryStudentList();
    }

    public void insert(View view) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                MyDataBase myDataBase = MyDataBase.getInstance(RoomMainActivity.this);
                for (int i = 0; i < 30; i++) {
                    myDataBase.studentDao().insertStudent(new Student("ZY", "" + i));
                }
                myDataBase.studentDao().insertStudent(new Student("ZY", "28"));
                Log.d(TAG, "insert");
            }
        }).start();
    }

    public void update(View view) {
        new Thread(() -> {
            MyDataBase myDataBase = MyDataBase.getInstance(RoomMainActivity.this);
            myDataBase.studentDao().updateStudent(new Student(1, "zy", "29"));
            Log.d(TAG, "update");
        }).start();
    }

    public void delete(View view) {
        new Thread(() -> {
            MyDataBase myDataBase = MyDataBase.getInstance(RoomMainActivity.this);
            myDataBase.studentDao().deleteStudent(new Student(1, "", ""));
            Log.d(TAG, "delete");
        }).start();
    }

    public void query(View view) {
        new Thread(() -> {
            MyDataBase myDataBase = MyDataBase.getInstance(RoomMainActivity.this);
            Student student = myDataBase.studentDao().getStudentById(1);
            Log.d(TAG, "query:" + student);
        }).start();
    }

    public void getAll(View view) {
        new Thread(() -> {
            MyDataBase myDataBase = MyDataBase.getInstance(RoomMainActivity.this);
            List<Student> students = myDataBase.studentDao().queryStudentList();
            for (Student student : students) {
                Log.d(TAG, "getAll:" + student);
            }
        }).start();
    }
}