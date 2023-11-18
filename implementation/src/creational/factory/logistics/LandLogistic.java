package creational.factory.logistics;

import creational.factory.IVehicle;
import creational.factory.Logistic;
import creational.factory.vehicles.Truck;

public class LandLogistic extends Logistic {
    @Override
    public IVehicle createVehicle() {
        return new Truck();
    }
}
