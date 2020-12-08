package com.example.room.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.room.RoomMainActivity;
import com.example.room.data.Student;
import com.example.room.database.MyDataBase;

import java.util.List;

public class StudentViewModel extends AndroidViewModel {

    private MyDataBase myDataBase;
    private LiveData<List<Student>> listLiveData;

    public StudentViewModel(@NonNull Application application) {
        super(application);
        myDataBase = MyDataBase.getInstance(application);
        listLiveData = myDataBase.studentDao().queryStudentListLiveData();
    }

    public LiveData<List<Student>> getStudentListLiveData() {
        return listLiveData;
    }
}
