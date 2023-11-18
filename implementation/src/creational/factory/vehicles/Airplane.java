package creational.factory.vehicles;

import creational.factory.IVehicle;

public class Airplane implements IVehicle {
    @Override
    public void transport() {
        System.out.println("Transporting by air");
    }
}
