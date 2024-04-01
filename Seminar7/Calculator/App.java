// Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
// Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
// Соблюдать принципы SOLID, паттерны проектирования.


public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        iCalculable calcOld = new Calculator(0);
        iCalculable decorator = new Decorator(new Calculator(0), new Logger());
        ViewCalculator view = new ViewCalculator(decorator);
        //view.run();
        iComplexCalculable cal = new ComplexCalculator(new ComplexNumber(0, 0));
        ComplexNumber firstNumber = new ComplexNumber(0, 0);
        ViewComplexCalculator cc = new ViewComplexCalculator(new ComplexCalculator(firstNumber));
        cc.run();
        // ComplexNumber qqq = new ComplexNumber(2, 5);
        // System.out.println(qqq);
    }
}
