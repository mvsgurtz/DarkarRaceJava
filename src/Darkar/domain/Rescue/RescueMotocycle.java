package Darkar.domain.Rescue;

import Darkar.domain.Vehicle.Motorcycle;

public class RescueMotocycle implements Rescuer<Motorcycle> {

    @Override
    public void rescue(Motorcycle motorcycle) {
        System.out.println("Rescued Motocycle: "+motorcycle.getLicensePlate());
    }
}
