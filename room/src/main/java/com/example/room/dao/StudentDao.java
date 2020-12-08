package com.example.room.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.room.data.Student;

import java.util.List;

@Dao
public interface StudentDao {
    @Insert
    void insertStudent(Student student);

    @Delete
    void deleteStudent(Student student);

    @Update
    void updateStudent(Student student);


    @Query("SELECT * FROM student_table")
    List<Student> queryStudentList();


    @Query("SELECT * FROM student_table WHERE id = :id")
    Student getStudentById(int id);
}
