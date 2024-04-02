package View;


import java.util.Scanner;

import Controller.Interfaces.iComplexCalculable;
import Domain.ComplexNumber;

public class ViewComplexCalculator {

    private iComplexCalculable calculator;

    /**Класс полностью аналогичен вьюшке от обычного калькулятора, за исключением дополнительного (мнимого) аргумента.
     * @param calculator Комплексный калькулятор
     */
    public ViewComplexCalculator(iComplexCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {

            int a = promptInt("Введите реальную часть первого числа: ");
            int b = promptInt("Введите мнимую часть первого числа: ");

            calculator.sum(a, b);

            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int c = promptInt("Введите реальную часть второго числа: ");
                    int d = promptInt("Введите мнимую часть второго числа: ");
                    calculator.multi(c, d);
                    continue;
                }
                if (cmd.equals("+")) {
                    int c = promptInt("Введите реальную часть второго числа: ");
                    int d = promptInt("Введите мнимую часть второго числа: ");
                    calculator.sum(c, d);
                    continue;
                }
                if (cmd.equals("/")) {
                    int c = promptInt("Введите реальную часть второго числа: ");
                    int d = promptInt("Введите мнимую часть второго числа: ");
                    calculator.div(c, d);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.printf("Результат %s\n", result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
