package creational.builder.builders;

import creational.builder.cars.Car;
import creational.builder.cars.CarType;
import creational.builder.components.Engine;
import creational.builder.components.Transmission;
import creational.builder.components.TripComputer;

public class CarConcreteBuilder implements Builder {
    Engine engine;
    int seats;
    int ports;
    CarType carType;
    Transmission transmission;
    TripComputer tripComputer;

    @Override
    public void setSeats(int seats){
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine){
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission){
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer){
        this.tripComputer = tripComputer;
    }

    @Override
    public void setPorts(int ports){
        this.ports = ports;
    }

    @Override
    public void setCarType(CarType carType){
        this.carType = carType;
    }

    public Car getResult(){
        return new Car(engine, transmission, tripComputer, ports, carType, seats);
    }
}
