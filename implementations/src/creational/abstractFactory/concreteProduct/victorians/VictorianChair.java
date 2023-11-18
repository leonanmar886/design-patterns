package creational.abstractFactory.concreteProduct.victorians;

import creational.abstractFactory.abstractProduct.IChair;

public class VictorianChair implements IChair {
    @Override
    public void hasLegs() {
        System.out.println("Victorian chair has 4 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a victorian chair");
    }
}
