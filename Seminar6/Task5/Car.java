package Task5;

// Переписать код в соответствии с Dependency Inversion Principle:
// Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.

public class Car {
    /*Заменил конкретный бензиновый двигатель на абстрактный двигатель. У класса двигатель создал наследников и переопределил метод старт */
    private Engine engine;
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        this.engine.start();
    }
}
