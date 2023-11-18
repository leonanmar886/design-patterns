import creational.abstractFactory.Client;
import creational.abstractFactory.concreteFactory.industrial.ConcreteIndustrialFactory;
import creational.abstractFactory.concreteFactory.modern.ConcreteModernFactory;

public class Main {
    public static void main(String[] args) {
        ConcreteIndustrialFactory concreteModernFactory = new ConcreteIndustrialFactory();
        Client client = new Client(concreteModernFactory);
        client.createFurniture();
    }
}