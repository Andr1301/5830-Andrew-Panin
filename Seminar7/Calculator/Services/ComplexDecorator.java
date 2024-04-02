package Services;
import Controller.Interfaces.iComplexCalculable;
import Domain.ComplexCalculator;
import Domain.ComplexNumber;

public class ComplexDecorator implements iComplexCalculable {

    private ComplexCalculator oldCalculator;
    private Logger logger;

    /**Декоратор, добавляющий логгер в вьюшку.
     * @param oldCalculator Комплексный калькулятор
     * @param logger Логгер, выводящий действительную и мнимую части.
     */
    public ComplexDecorator(ComplexCalculator oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }
    
    @Override
    public ComplexNumber sum(double a, double b) {
        ComplexNumber firstArg = oldCalculator.getResult();

        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum с параметрами %f и %fi", firstArg, a, b));
        ComplexNumber result = oldCalculator.sum(a, b);
        logger.log(String.format("Вызова метода sum произошел"));

        return result;
    }
    @Override
    public ComplexNumber multi(double a, double b) {
        ComplexNumber firstArg = oldCalculator.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода multi с параметрами %f и %f", firstArg, a, b));
        ComplexNumber result = oldCalculator.multi(a, b);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }
    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = oldCalculator.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }

    @Override
    public ComplexNumber div(double a, double b) {
        ComplexNumber firstArg = oldCalculator.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода div с параметрами %f и %f", firstArg, a, b));
        ComplexNumber result = oldCalculator.div(a, b);
        logger.log(String.format("Вызова метода div произошел"));
        return result;
    }

    
    
}
