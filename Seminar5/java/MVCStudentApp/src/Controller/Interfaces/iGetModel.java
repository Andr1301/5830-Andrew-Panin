package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetModel {
    public List<Student> getAllStudents();
    public List<Student> deleteStudent(int delete);
}
