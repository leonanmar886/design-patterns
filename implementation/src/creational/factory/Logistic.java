package creational.factory;

public abstract class Logistic {
    public abstract IVehicle createVehicle();

    public void transport() {
        IVehicle vehicle = createVehicle();
        vehicle.transport();
    }
}
