package creational.builder;

import creational.builder.builders.Builder;
import creational.builder.cars.CarType;
import creational.builder.components.Engine;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

public class Director {
    public void constructSportsCar(Builder builder) {
        builder.setSeats(2);
        builder.setEngine(new Engine("V8", 400, 500));
        builder.setTransmission(new Transmission("Manual", 6));
        builder.setTripComputer(new TripComputer());
        builder.setPorts(2);
        builder.setCarType(CarType.SPORTS_CAR);
    }

    public void constructSUV(Builder builder) {
        builder.setSeats(6);
        builder.setEngine(new Engine("V6", 200, 300));
        builder.setTransmission(new Transmission("Semi-Automatic", 5));
        builder.setTripComputer(new TripComputer());
        builder.setPorts(4);
        builder.setCarType(CarType.SUV);
    }

    public void constructCityCar(Builder builder) {
        builder.setSeats(4);
        builder.setEngine(new Engine("V4", 100, 200));
        builder.setTransmission(new Transmission("Automatic", 4));
        builder.setTripComputer(new TripComputer());
        builder.setPorts(4);
        builder.setCarType(CarType.CITY_CAR);
    }
}
