package Darkar.test;

import Darkar.domain.Race;
import Darkar.domain.Vehicle.Car;
import Darkar.domain.Vehicle.Motorcycle;
import Darkar.domain.Vehicle.Vehicle;

public class DarkarTests {
    public static void main(String[] args) {
        Race race = new Race();

        Car car1 = new Car(100, 150, 5, "FAZOL");
        Car car2 = new Car(200, 200, 10, "FAZO22");
        Car car3 = new Car(500, 200, 20, "ViniStef");
        Motorcycle motorcycle1 = new Motorcycle(400, 130, 7, "FODEU");
        Motorcycle motorcycle2 = new Motorcycle(350, 500, 19, "SELEUMAMOU");
        Motorcycle motorcycle3 = new Motorcycle(600, 100, 20, "GurtZ");

        race.addCarToRace(car1);
        race.addCarToRace(car2);
        race.addCarToRace(car3);
        race.addMotorcycleToRace(motorcycle1);
        race.addMotorcycleToRace(motorcycle2);
        race.addMotorcycleToRace(motorcycle3);

        race.showVehicles();

        race.eliminateVehicle(car1);
        race.eliminateByLicensePlate("SELEUMAMOU");

        race.showVehicles();

        race.rescueCar("FAZO22");
        race.rescueMotocycle("FODEU");

        race.showVehicles();

        race.raceWinner(race.getVehicles());
    }
}
