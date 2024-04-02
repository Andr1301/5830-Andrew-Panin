package Domain;

/*Класс, создающий комплексные числа. Реальная и мнимая части задаются типом double, поскольку при делении результат может быть дробным. */
public class ComplexNumber{

    private double realPart;
    private double imPart;
    
    public ComplexNumber(double realPart, double imPart) {
        this.realPart = realPart;
        this.imPart = imPart;
    }

    @Override
    public String toString() {
        return realPart + " + " + imPart + "i";
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public void setImPart(double imPart) {
        this.imPart = imPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public double getImPart() {
        return imPart;
    }
    
}
