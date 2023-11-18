package creational.builder.cars;

import creational.builder.components.Engine;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

public class Car {
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private int portNumbers;
    private CarType type;
    private double fuel;
    private int seats;

    public Car(Engine engine, Transmission transmission, TripComputer tripComputer, int portNumbers, CarType type, int seats) {
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.portNumbers = portNumbers;
        this.type = type;
        this.seats = seats;
    }

    public Car(){}

    public double getFuelLevel() {
        return fuel;
    }
}
