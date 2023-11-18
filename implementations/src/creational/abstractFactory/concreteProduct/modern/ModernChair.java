package creational.abstractFactory.concreteProduct.modern;

import creational.abstractFactory.abstractProduct.IChair;

public class ModernChair implements IChair {
    @Override
    public void hasLegs() {
        System.out.println("Modern chair has 0 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair");
    }
}
