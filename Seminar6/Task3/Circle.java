package Task3;
// Переписать код в соответствии с Interface Segregation Principle:
// Подсказка: круг не объемная фигура и этому классу не нужен метод volume().

/*В класс круг имплементируем "плоский" интерфейс */
public class Circle implements ShapeFlat {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
@Override
public double area() {
    return 2 * 3.14 * radius;
}

}
