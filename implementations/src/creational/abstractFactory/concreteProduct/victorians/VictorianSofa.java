package creational.abstractFactory.concreteProduct.victorians;

import creational.abstractFactory.abstractProduct.ISofa;

public class VictorianSofa implements ISofa {
    @Override
    public void hasLegs() {
        System.out.println("Victorian sofa has 8 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a victorian sofa");
    }
}
