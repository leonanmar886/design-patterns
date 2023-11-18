package creational.factory.logistics;

import creational.factory.IVehicle;
import creational.factory.Logistic;
import creational.factory.vehicles.Ship;

public class SeaLogistic extends Logistic {
    @Override
    public IVehicle createVehicle() {
        return new Ship();
    }

}
