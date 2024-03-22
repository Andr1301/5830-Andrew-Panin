package Task2;

public class Bus extends Vehicle{

    public Bus(int maxSpeed, String type) {
        super(maxSpeed, type);
    }
    
    @Override
    public double calculateAllowedSpeed(Vehicle vehicle) {
            return vehicle.getMaxSpeed() * 0.6;
    }   

}
