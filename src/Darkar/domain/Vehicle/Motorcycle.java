package Darkar.domain.Vehicle;

public class Motorcycle extends Vehicle {

    public Motorcycle(int horsePower, int acceleration, int spinAngle, String licensePlate) {
        super(horsePower, acceleration, spinAngle, licensePlate);
        super.setWeight(300);
        super.setWheels(2);
    }

    @Override
    public int getHorsePower() {
        return super.getHorsePower();
    }

    @Override
    public void setHorsePower(int horsePower) {
        super.setHorsePower(horsePower);
    }

    @Override
    public int getAcceleration() {
        return super.getAcceleration();
    }

    @Override
    public void setAcceleration(int acceleration) {
        super.setAcceleration(acceleration);
    }

    @Override
    public int getWeight() {
        return super.getWeight();
    }

    @Override
    public final void setWeight(int weight) {
        super.setWeight(weight);
    }

    @Override
    public int getWheels() {
        return super.getWheels();
    }

    @Override
    public final void setWheels(int wheels) {
        super.setWheels(wheels);
    }

    @Override
    public int getSpinAngle() {
        return super.getSpinAngle();
    }

    @Override
    public void setSpinAngle(int spinAngle) {
        super.setSpinAngle(spinAngle);
    }

    @Override
    public String getLicensePlate() {
        return super.getLicensePlate();
    }

    @Override
    public void setLicensePlate(String licensePlate) {
        super.setLicensePlate(licensePlate);
    }
}
