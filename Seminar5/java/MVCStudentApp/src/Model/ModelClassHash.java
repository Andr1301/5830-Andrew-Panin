package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClassHash implements iGetModel{

    int i = 0;
    private HashMap<Integer, Student> hashStudents = new HashMap<>();
    private List<Student> students;

    public ModelClassHash(List<Student> students){
        for(Student st : students){
            hashStudents.put(st.getId(), st);
        }
    }

    @Override
    public String toString() {
        return "" + hashStudents;
    }

    @Override
    public List<Student> getAllStudents() {

        List<Student> students  = new ArrayList<Student>();

        for(Entry<Integer, Student> entry : hashStudents.entrySet()){
            students.add(entry.getValue());
        }
        return students;

    }

    @Override
    public List<Student> deleteStudent(int delete) {
        List<Student> students  = new ArrayList<Student>();
        hashStudents.remove(delete);
        for(Entry<Integer, Student> entry : hashStudents.entrySet()){
            students.add(entry.getValue());
        }
        return students;
    }

}
