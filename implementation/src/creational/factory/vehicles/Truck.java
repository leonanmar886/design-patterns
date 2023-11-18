package creational.factory.vehicles;

import creational.factory.IVehicle;

public class Truck implements IVehicle {
    @Override
    public void transport() {
        System.out.println("Transporting by land");
    }
}
