package creational.factory.vehicles;

import creational.factory.IVehicle;

public class Ship implements IVehicle {
    @Override
    public void transport() {
        System.out.println("Transporting by sea");
    }
}
