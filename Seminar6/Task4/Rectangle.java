package Task4;

// Переписать код в соответствии с Liskov Substitution Principle:

public class Rectangle {

    private int width;
    private int height;

    /**Добавил конструктор класса
     * @param width Ширина
     * @param height Высота
     */
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int area() {
        return this.width * this.height;
    }
}
