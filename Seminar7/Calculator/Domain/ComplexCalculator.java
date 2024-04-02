package Domain;

import Controller.Interfaces.iComplexCalculable;

/*Калькулятор, в котором прописана логика арифметических действий с комплексными числами */
public final class ComplexCalculator implements iComplexCalculable {

    private ComplexNumber firstNum;

    /**Конструктор, создающий калькулятор с комплексным числом в качестве главного аргумента 
     * @param firstNum Комплексное число, с которым мы будем производить арифметические операции
     */
    public ComplexCalculator(ComplexNumber firstNum) {
        this.firstNum = firstNum;
    }

    @Override
    public ComplexNumber sum(double a, double b) {

        firstNum.setRealPart(a += firstNum.getRealPart());
        firstNum.setImPart(b += firstNum.getImPart());

        return firstNum;
    }

    @Override
    public ComplexNumber multi(double a, double b) {

        double r = (firstNum.getRealPart()*a) - (firstNum.getImPart()*b);
        double im = (firstNum.getImPart()*a)+(firstNum.getRealPart()*b);

        firstNum.setRealPart(r);
        firstNum.setImPart(im);
        
        return firstNum;
    }

    @Override
    public ComplexNumber div(double a, double b) {
        //Проверка деления на ноль
        double divider = a*a + b*b;

        if (divider == 0){
            System.out.println("Некорректная операция! Действительная и мнимая часть делителя равны нулю, деление на ноль невозможно!");
        }
        else{
            double r = ((firstNum.getRealPart()*a) + (firstNum.getImPart()*b)) / (divider);
            double im = ((firstNum.getImPart()*a) - (firstNum.getRealPart()*b)) / (divider);
            firstNum.setRealPart(r);
            firstNum.setImPart(im);
        }
        
        return firstNum;
    }

    @Override
    public ComplexNumber getResult() {
        return firstNum;
    }

}
