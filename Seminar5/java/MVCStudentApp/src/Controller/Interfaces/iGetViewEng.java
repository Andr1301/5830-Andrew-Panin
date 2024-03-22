package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;

public interface iGetViewEng {
     public void printAllStudentsEng(List<Student> students);
     public String prompt(String msg);
}
