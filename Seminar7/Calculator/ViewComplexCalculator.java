

import java.util.Scanner;

public class ViewComplexCalculator {

    private iComplexCalculable calculator;

    public ViewComplexCalculator(iComplexCalculable calculator) {
        this.calculator = calculator;
    }

    public void run() {
        while (true) {
            int a = promptInt("Введите реальную часть первого числа: ");
            int b = promptInt("Введите мнимую часть первого числа: ");
            //ComplexNumber firstNumber = new ComplexNumber(a, b);
            //System.out.println(firstNumber);
            calculator.sum(a, b);
            //System.out.println(firstNumber);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true) {
                String cmd = prompt("Введите команду (*, +, /, =) : ");
                if (cmd.equals("*")) {
                    int c = promptInt("Введите реальную часть второго числа: ");
                    int d = promptInt("Введите мнимую часть второго числа: ");
                    //ComplexNumber secondNumber = new ComplexNumber(c, d);
                    calculator.multi(c, d);
                    System.out.println(calculator.getResult());
                    continue;
                }
                if (cmd.equals("+")) {
                    int c = promptInt("Введите реальную часть второго числа: ");
                    int d = promptInt("Введите мнимую часть второго числа: ");
                    //ComplexNumber secondNumber = new ComplexNumber(c, d);
                    //System.out.println(secondNumber);
                    calculator.sum(c, d);
                    System.out.println(calculator.getResult());
                    continue;
                }
                if (cmd.equals("/")) {
                    int c = promptInt("Введите реальную часть второго числа: ");
                    int d = promptInt("Введите мнимую часть второго числа: ");
                    calculator.div(c, d);
                    System.out.println(calculator.getResult());
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
