package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Controller.Interfaces.iGetViewEng;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClass;

public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Student> buffer = new ArrayList<>();
    private iGetViewEng viewEng;

    public ControllerClass(iGetModel model, iGetView view, iGetViewEng viewEng) {
        this.model = model;
        this.view = view;
        this.viewEng = viewEng;
    }

    private boolean testData(List<Student> students)
    {
        if(students.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {
        //MVC
        //view.printAllStudents(model.getAllStudents());

        //MVP
        buffer = model.getAllStudents();

        if(testData(buffer))
        {
            view.printAllStudents(buffer);
        }
        else{
            System.out.println("Список студентов пуст!");
        }
    }

    public void run() {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while (getNewIteration) {
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());
            switch (com) {
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы!");
                    break;
                case LIST:
                    //MVC
                    view.printAllStudents(model.getAllStudents());
                    break;
                case ENGLIST:
                    viewEng.printAllStudentsEng(model.getAllStudents());
                    break;
                case DELETE:
                //Проверка правильности ввода ид
                    int delete = Integer.parseInt(view.prompt("Введите ID студента, которого необходимо удалить: "));
                    if(-1 < delete && delete < model.getAllStudents().size()){
                        model.deleteStudent(delete);
                    }
                    else{
                        System.out.println("Студента с таким идентификатором не существует!");
                    }

            }
        }
    }
    
}
