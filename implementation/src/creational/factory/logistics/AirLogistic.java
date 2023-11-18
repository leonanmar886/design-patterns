package creational.factory.logistics;

import creational.factory.IVehicle;
import creational.factory.Logistic;
import creational.factory.vehicles.Airplane;

public class AirLogistic extends Logistic {
    @Override
    public IVehicle createVehicle() {
        return new Airplane();
    }
}
