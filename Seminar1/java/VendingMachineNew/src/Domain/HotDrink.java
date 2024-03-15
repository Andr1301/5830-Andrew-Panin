package Domain;

public class HotDrink extends Product{
    private int temperature;

    public HotDrink(double price, int place, String name, int temperature) {
        super(price, place, name);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "temperature" + temperature;
    } 
}
