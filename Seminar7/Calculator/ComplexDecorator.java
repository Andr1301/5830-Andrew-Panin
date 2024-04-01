public class ComplexDecorator implements iComplexCalculable {

    private ComplexCalculator oldCalculator;
    private Logger logger;

    public ComplexDecorator(ComplexCalculator oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }
    
    @Override
    public ComplexNumber sum(double a, double b) {
        ComplexNumber firstArg = oldCalculator.getResult();

        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода sum с параметром %d", firstArg));
        ComplexNumber result = oldCalculator.sum(a, b);
        logger.log(String.format("Вызова метода sum произошел"));

        return result;
    }
    @Override
    public iCalculable multi(int arg) {
        int firstArg = oldCalculator.getResult();
        logger.log(String.format("Первое значение калькулятора %d. Начало вызова метода multi с параметром %d", firstArg, arg));
        iCalculable result = oldCalculator.multi(arg);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }
    @Override
    public int getResult() {
        int result = oldCalculator.getResult();
        logger.log(String.format("Получение результата %d", result));
        return result;
    }

    @Override
    public ComplexNumber sum(double a, double b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sum'");
    }

    @Override
    public ComplexNumber multi(double a, double b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'multi'");
    }

    @Override
    public ComplexNumber div(double a, double b) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'div'");
    }

    
    
}
