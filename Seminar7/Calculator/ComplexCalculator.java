public final class ComplexCalculator implements iComplexCalculable {

    private ComplexNumber firstNum;

    public ComplexCalculator(ComplexNumber firstNum) {
        this.firstNum = firstNum;
    }

    @Override
    public ComplexNumber sum(double a, double b) {

        // int a = firstNum.getRealPart();
        // int b = firstNum.getImPart();

        // firstNum.setRealPart(a += secondNum.getRealPart());
        // firstNum.setImPart(b += secondNum.getImPart());

        firstNum.setRealPart(a += firstNum.getRealPart());
        firstNum.setImPart(b += firstNum.getImPart());

        return firstNum;
    }

    @Override
    public ComplexNumber multi(double a, double b) {

        // int a = firstNum.getRealPart();
        // int b = firstNum.getImPart();
        // int c = secondNum.getRealPart();
        // int d = secondNum.getImPart();

        double r = (firstNum.getRealPart()*a) - (firstNum.getImPart()*b);
        double im = (firstNum.getImPart()*a)+(firstNum.getRealPart()*b);

        firstNum.setRealPart(r);
        firstNum.setImPart(im);
        
        return firstNum;
    }

    @Override
    public ComplexNumber div(double a, double b) {

        // int a = firstNum.getRealPart();
        // int b = firstNum.getImPart();
        // int c = secondNum.getRealPart();
        // int d = secondNum.getImPart();

        double r = ((firstNum.getRealPart()*a) + (firstNum.getImPart()*b)) / (a*a + b*b);
        double im = ((firstNum.getImPart()*a) - (firstNum.getRealPart()*b)) / (a*a + b*b);

        firstNum.setRealPart(r);
        firstNum.setImPart(im);
        
        return firstNum;
    }

    @Override
    public ComplexNumber getResult() {
        return firstNum;
    }

}
