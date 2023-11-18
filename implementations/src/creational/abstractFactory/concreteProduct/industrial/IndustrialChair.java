package creational.abstractFactory.concreteProduct.industrial;

import creational.abstractFactory.abstractProduct.IChair;

public class IndustrialChair implements IChair {
    @Override
    public void hasLegs() {
        System.out.println("Industrial chair has 1 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a industrial chair");
    }
}
