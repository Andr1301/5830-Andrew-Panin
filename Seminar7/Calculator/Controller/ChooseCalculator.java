package Controller;
import java.util.Scanner;

import Controller.Interfaces.iCalculable;
import Controller.Interfaces.iComplexCalculable;
import Domain.Calculator;
import Domain.ComplexCalculator;
import Domain.ComplexNumber;
import Services.ComplexDecorator;
import Services.Decorator;
import Services.Logger;
import View.ViewCalculator;
import View.ViewComplexCalculator;

/*Контроллер, отвечающий за выбор типа калькулятора. В нем создаются необходимые переменные и запускаются соответствующие вьюшки */
public class ChooseCalculator {
    
    /**Пустой конструктор, просто чтобы была возможность создать и запустить экземпляр класса
     * 
     */
    public ChooseCalculator() {
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    /**Запуск контроллера
     * 
     */
    public void start(){
        //Массив для более удобного вывода инструкции
        String[] types  = {"1: Обычный", "2: Обычный с логгером", "3: Комплексный", "4: Комплексный с логгером", "5: Выход"};

        while (true) {
            System.out.println("Выберите калькулятор: ");
            for (String st : types){
                System.out.println(st);
            }
            String cmd = prompt("Введите команду (1, 2, 3, 4) : ");
            if (cmd.equals("1")) {
                iCalculable calc = new Calculator(0);
                ViewCalculator view = new ViewCalculator(calc);
                view.run();
            }
            if (cmd.equals("2")) {
                iCalculable decorator = new Decorator(new Calculator(0), new Logger());
                ViewCalculator view = new ViewCalculator(decorator);
                view.run();
            }
            if (cmd.equals("3")) {
                ComplexNumber firstNumber = new ComplexNumber(0, 0);
                ViewComplexCalculator view = new ViewComplexCalculator(new ComplexCalculator(firstNumber));
                view.run();
            }
            if (cmd.equals("4")) {
                ComplexNumber firstNumber = new ComplexNumber(0, 0);
                iComplexCalculable complexDecorator = new ComplexDecorator(new ComplexCalculator(firstNumber), new Logger());
                ViewComplexCalculator view = new ViewComplexCalculator(complexDecorator);
                view.run();
            }
            if (cmd.equals("5")) {
                System.out.println("Завершение работы калькулятора");
                break;
            }
    }
}
}

