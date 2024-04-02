// Создать проект калькулятора комплексных чисел (достаточно сделать сложение, умножение и деление).
// Применить при создании программы архитектурные паттерны, добавить логирование калькулятора.
// Соблюдать принципы SOLID, паттерны проектирования.

/*Описание решения:
 * Посредством контроллера ChooseCalculator запускается выбор типа калькулятора. 
 * Логгер использован тот же, что был в семинаре, имплементируется через ComplexDecorator.
 */

import Controller.ChooseCalculator;

public class App {
    public static void main(String[] args) throws Exception {

        ChooseCalculator choose = new ChooseCalculator();
        choose.start();
    }
}
