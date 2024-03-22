import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.View;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Controller.Interfaces.iGetViewEng;
import Model.FileModelClass;
import Model.ModelClass;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;


// 1) Сделать вариант класса ViewClassEng с текстом на английском языке, подключить к нему интерфейс iGetView. Класс ViewEng подключить к контроллеру.
// 2) Сделать вариант класса ModelClassHash с хранилищем типа HashMap<int,Student>, подключить к нему интерфейс iGetModel. Класс подключить к контроллеру.
// 3) Добавить команду в метод run класса контролер по удалению студента:
// Для этого: Добавить в switch команду DELETE
// - запросить у пользователя номер студента на удаление
// - вызов удаления у модели(метод добавить в интерфейс iGetModel)
// - если такого нромера нет, то сообщить об этом
// Весь код прокомментировать и добавить само-документацию.

// (задача со *)
// 1) решить базовое решение
// 2) сделать выбор языка при запуске контроллера
// 3) сделать несколько моделей и студентов распределить по ним
// 4) если не найден студент в одной модели продолжить поиск в следующей

public class App {
    public static void main(String[] args) throws Exception {
      

        Student student1 = new Student("Ivan", 21);
        Student student2 = new Student("Anna", 25);
        Student student3 = new Student("Vasya", 22);
        Student student4 = new Student("Nastya", 27);
        Student student5 = new Student("Vasilisa", 26);
        Student student6 = new Student("Karina", 25);
        Student student7 = new Student("Andrey", 22);
        Student student8 = new Student("Masha", 27);
        Student student9 = new Student("Irina", 28);
        Student student10 = new Student("Nikolay", 30);

        List<Student> studList = new ArrayList<>();
        studList.add(student1);
        studList.add(student2);
        studList.add(student3);
        studList.add(student4);
        studList.add(student5);
        studList.add(student6);
        studList.add(student7);
        studList.add(student8);
        studList.add(student9);
        studList.add(student10);

        FileModelClass fmodel = new FileModelClass("StudentDB.csv");
        //fmodel.saveAllStudentToFile(studList);


        iGetModel model = new ModelClass(studList);
        iGetView view = new ViewClass();
        iGetViewEng viewEng = new ViewClassEng();

        ModelClassHash hhh = new ModelClassHash(studList);

        ControllerClass controller = new ControllerClass(hhh, view, viewEng);
        ControllerClass controller1 = new ControllerClass(fmodel, view, viewEng);

        controller.run();
        //controller1.run();


        }
}


