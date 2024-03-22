package Task4;
/*Вынес квадрат в отдельный файл */
public class Square extends Rectangle {
    
    /**Добавил конструктор класса
     * @param width Ширина, она же высота
     */
    public Square(int width) {
        super(width, width);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    
    }
    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
    }
// В такой конфигурации, класс Square будет работать как прямоугольник, у которого равные стороны.