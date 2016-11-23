package com.company.DAO;

/**
 * Created by Пользователь on 22.11.2016.
 */
import java.util.List;
public interface StudentDAO {
    public List<Student> getAllStudents();
    public Student getStudent(int rollNo);
    public void updateStudent(Student student);
    public void deleteStudent(Student student);
}