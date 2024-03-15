import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.Employee;
import Domain.PersonComparator;
import Domain.Student;
import Domain.StudentGroup;
import Domain.Teacher;
import Services.StudentService;
import Services.TeacherService;

// 1) Создать класс TeacherService и реализовать аналогично проделанному на семинаре. Подключить обобщенный интерфейс iPersonService. 
// Добавить метод вывода списка учителей отсортированного обобщенным классом PersonComparator
// 2) Разработать обобщенный метод averageAge для подсчета среднего возраста студентов, учителей и работников. 
// Вывести результат работы класса на консоль. Метод сделать статическим в классе AccountController.

// (Задача со *) Переписать иерархию Person->Student/Teacher/Emploee в иерархию обобщенных типов.

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  23);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        
        
        StudentGroup group4580 = new StudentGroup(listStud, 4580);
                
                StudentService studServ = new StudentService();
                
                for(Student s : listStud)
                {
                    studServ.create(s.getName(), s.getAge());
                }

                AccountController.print(studServ.getAll());
                
                studServ.sortByFIO();
                
                System.out.println("                             ");
                
                AccountController.print(studServ.getAll());
                
                
                Teacher t1 = new Teacher("Галина", 55, "Docent");
                Employee e1 = new Employee("Татьяна", 57, "Slesar");
                
                System.out.println(new PersonComparator<Student>().compare(s1, s3));
                
                AccountController.paySalary(t1, 50000);      
                
                System.out.println(AccountController.averageAge(listStud));

                System.out.println("==============================");

                Teacher t2 = new Teacher("Алексей", 45, "Docent");
                Teacher t3 = new Teacher("Ян", 45, "Docent");
                Teacher t4 = new Teacher("Сергей", 45, "Docent");
                Teacher t5 = new Teacher("Геннадий", 45, "Docent");
                Teacher t6 = new Teacher("Виктор", 45, "Docent");
                
                List<Teacher> listTeach = new ArrayList<>();

                listTeach.add(t1);
                listTeach.add(t2);
                listTeach.add(t3);
                listTeach.add(t4);
                listTeach.add(t5);
                listTeach.add(t6);

                // AccountController.printSortedByFIO(listTeach);
                // AccountController.printSortedByFIO(listStud);

                TeacherService teachServ = new TeacherService();

                for(Teacher t : listTeach){
                    teachServ.create(t.getName(), t.getAge());
                }

                AccountController.printSortedByFIO(teachServ.getAll());

                System.out.println(AccountController.averageAge(listTeach));
                System.out.println(AccountController.averageAge(studServ.getAll()));
            }
}
