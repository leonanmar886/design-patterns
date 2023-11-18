package creational.abstractFactory;

public class Client {
    private IAbstractFactory abstractFactory;

    public Client(IAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public void createFurniture() {
        abstractFactory.createChair().sitOn();
        abstractFactory.createChair().hasLegs();
        abstractFactory.createSofa().sitOn();
        abstractFactory.createSofa().hasLegs();
        abstractFactory.createTable().putOn();
        abstractFactory.createTable().hasLegs();
    }
}
