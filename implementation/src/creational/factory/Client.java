package creational.factory;

import creational.factory.logistics.AirLogistic;
import creational.factory.logistics.SeaLogistic;

public class Client {
    Logistic logistic = new AirLogistic();
    IVehicle vehicle = logistic.createVehicle();
    public void transport() {
        vehicle.transport();
    }

}
