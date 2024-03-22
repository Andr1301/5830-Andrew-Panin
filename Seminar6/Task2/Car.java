package Task2;

public class Car extends Vehicle{

    public Car(int maxSpeed, String type) {
        super(maxSpeed, type);
    }

    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.getMaxSpeed() * 0.8;
    }   
}
