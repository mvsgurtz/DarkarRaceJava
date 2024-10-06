package Darkar.domain.Rescue;

import Darkar.domain.Vehicle.Car;

public class RescueCar implements Rescuer<Car> {

    @Override
    public void rescue(Car car) {
        System.out.println("Rescued car: "+car.getLicensePlate());
    }
}
