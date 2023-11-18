package creational.abstractFactory.concreteProduct.modern;

import creational.abstractFactory.abstractProduct.ISofa;

public class ModernSofa implements ISofa {
    @Override
    public void hasLegs() {
        System.out.println("Modern sofa has 0 legs");
    }

    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern sofa");
    }
}
