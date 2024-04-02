package Controller.Interfaces;

import Domain.ComplexNumber;

public interface iComplexCalculable{

    /**Сложение комплексных чисел
     * @param a Реальная часть второго числа
     * @param b Мнимая часть второго числа
     * @return Возвращает первое комплексное число после проведения арифметической операции
     */
    public ComplexNumber sum(double a, double b);

    /**Умножение комплексных чисел
     * @param a Реальная часть второго числа
     * @param b Мнимая часть второго числа
     * @return Возвращает первое комплексное число после проведения арифметической операции
     */
    public ComplexNumber multi(double a, double b);

    /**Деление комплексных чисел
     * @param a Реальная часть второго числа
     * @param b Мнимая часть второго числа
     * @return Возвращает первое комплексное число после проведения арифметической операции
     */
    public ComplexNumber div(double a, double b);

    /**Получаем результат
     * @return Возвращает первое комплексное число
     */
    public ComplexNumber getResult();
}
