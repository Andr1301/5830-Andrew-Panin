package Task3;

/*В класс куб имплементируем "объемный" интерфейс */
public class Cube implements ShapeVolume {

    private int edge;
    
    public Cube(int edge) {
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6 * edge * edge;
    }
    @Override
    public double volume() {
        return edge * edge * edge;
    }
}