package Darkar.domain.Vehicle;

public abstract class Vehicle {
    private int horsePower;
    private int acceleration;
    private int weight;
    private int wheels;
    private int spinAngle;
    private String licensePlate;

    public Vehicle(int horsePower, int acceleration, int spinAngle, String licensePlate) {
        this.horsePower = horsePower;
        this.acceleration = acceleration;
        this.spinAngle = spinAngle;
        this.licensePlate = licensePlate;
    }

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "horsePower=" + horsePower +
                ", acceleration=" + acceleration +
                ", spinAngle=" + spinAngle +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSpinAngle() {
        return spinAngle;
    }

    public void setSpinAngle(int spinAngle) {
        this.spinAngle = spinAngle;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
}
