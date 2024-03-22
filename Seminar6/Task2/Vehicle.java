package Task2;

public abstract class Vehicle {

    int maxSpeed;
    String type;

    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }
    public String getType() {
        return this.type;
    }

    public double calculateAllowedSpeed(Vehicle vehicle) {
        return vehicle.getMaxSpeed();
    }  
}
