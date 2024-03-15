package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Teacher;

public class TeacherService implements iPersonService<Teacher>{

    int count;
    List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, "acadDegree");
        count++;
        teachers.add(teach);
    }

}
