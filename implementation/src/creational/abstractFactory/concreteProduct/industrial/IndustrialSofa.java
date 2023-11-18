package creational.abstractFactory.concreteProduct.industrial;

import creational.abstractFactory.abstractProduct.ISofa;

public class IndustrialSofa implements ISofa {
    @Override
    public void hasLegs() {
        System.out.println("Industrial sofa has 2 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a industrial sofa");
    }
}
