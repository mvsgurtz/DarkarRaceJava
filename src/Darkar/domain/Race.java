package Darkar.domain;

import Darkar.domain.Rescue.RescueCar;
import Darkar.domain.Rescue.RescueMotocycle;
import Darkar.domain.Vehicle.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Race {
    private double distance;
    private double prizeDollar;
    private String awardName;
    private int numOfVehicles;
    List<Vehicle> vehicles = new ArrayList<>();

    private RescueCar rescueCar = new RescueCar();
    private RescueMotocycle rescueMotocycle = new RescueMotocycle();

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getPrizeDollar() {
        return prizeDollar;
    }

    public void setPrizeDollar(double prizeDollar) {
        this.prizeDollar = prizeDollar;
    }

    public String getAwardName() {
        return awardName;
    }

    public void setAwardName(String awardName) {
        this.awardName = awardName;
    }

    public int getNumOfVehicles() {
        return numOfVehicles;
    }

    public void setNumOfVehicles(int numOfVehicles) {
        this.numOfVehicles = numOfVehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addCarToRace(Car car) {
        vehicles.add(car);
    }

    public void showVehicles() {
        System.out.println(vehicles);
    }

    public void addMotorcycleToRace(Motorcycle motorcycle) {
        vehicles.add(motorcycle);
    }

    public void eliminateVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }

    public void eliminateByLicensePlate(String licensePlate) {
        vehicles.removeIf(vehicle -> vehicle.getLicensePlate().equals(licensePlate));
    }
    public void raceWinner(List<Vehicle> vehicles) {
        Vehicle winningVehicle = vehicles.stream()
                .max(Comparator.comparing(vehicle ->
                        (vehicle.getHorsePower() * (vehicle.getAcceleration() / 2) /
                                (vehicle.getSpinAngle() * (vehicle.getWeight() - vehicle.getWheels() * 100)))
                ))
                .orElse(null);

        System.out.println("O veiculo vencedor foi: "+winningVehicle.getLicensePlate());
    }

    public void rescueCar ( String licensePlate) {
        Car carToBeRescued = (Car) vehicles.stream().filter(vehicle -> vehicle.getLicensePlate().equals(licensePlate)).findFirst().orElse(null);
        rescueCar.rescue(carToBeRescued);
        eliminateByLicensePlate(licensePlate);
    }

    public void rescueMotocycle ( String licensePlate) {
        Motorcycle motorcycleToBeRescued = (Motorcycle) vehicles.stream().filter(vehicle -> vehicle.getLicensePlate().equals(licensePlate)).findFirst().orElse(null);
        rescueMotocycle.rescue(motorcycleToBeRescued);
        eliminateByLicensePlate(licensePlate);
    }

}
