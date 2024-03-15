import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Domain.Student;
import Domain.StudentGroup;
import Domain.StudentStream;

// 1) Создать класс StudentSteam(поток студентов с полем номер потока) содержащий в себе список учебных групп(StudentGroup).
// 2) Для класса StudentSteam реализовать интерфейс Iterable и вывести через for несколько групп со списком студентов на кансоль
// 3) Для класса StudentGroup реализовать интерфейс Comparable(сортировка по количеству студентов в группе) и отсортировать группы студентов в потоке, 
// а затем вывести в консоль

// (задача со *)
// 1) Отсортировать группы студентов в потоке сначало по количеству студентов, а затем по идентификатору группы
// 2) Переопределить методы ToString классов StudentGroup(выводить идентификатор группы, количество студентов и список студентов) 
// и StudentSteam(выводить номер потока, количество групп и список студентов с указанием идентификатора группы)

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        Student s7 = new Student("Маша",  20);
        Student s8 = new Student("Даша",  23);
        Student s9 = new Student("Саша",  18);
        Student s10 = new Student("Паша",  18);
        Student s11 = new Student("Глаша",  24);
        Student s12 = new Student("Наташа",  19);
        Student s13 = new Student("Простокваша",  21);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        List<Student> listStud2 = new ArrayList<>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);
        // listStud2.add(s13);
        

        StudentGroup group5834 = new StudentGroup(listStud, 5834);
        StudentGroup group5830 = new StudentGroup(listStud2, 5830);

        List<StudentGroup> listGroup = new ArrayList<>();
        listGroup.add(group5830);
        listGroup.add(group5834);

        StudentStream stream1 = new StudentStream(listGroup, 1);
                    
            System.out.println("=========================================================");
            
            Collections.sort(group5830.getGroup());
            
            for(Student std: group5830.getGroup())
            {
                System.out.println(std);
            }
            System.out.println("=========================================================");
            
            Collections.sort(stream1.getStream()); //Для проверки сортировки по кол-ву студентов, достаточно раскоментировать строку 52
                
        System.out.println(stream1);
    }
}
