package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetViewEng;
import Model.Domain.Student;

/*Для правильной работы контроллера, пришлось помимо класса ЕНГ создать еще и интерфейс, и добавить его в конструктор
 * контроллера, а также добавить новую консольную команду в список команд. Решение корявое, 
 * но ничего лучше в данных условиях (с обязательным созданием класса енгвью) придумать не удалось.
 */

public class ViewClassEng implements iGetViewEng {

    public void printAllStudentsEng(List<Student> students)
    {
        System.out.println("------------------- Students list ---------------------------");

        for(Student s : students)
        {
            System.out.println(s);
        }

        System.out.println("------------------------------------------------------------------");
    }

    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
    
}
