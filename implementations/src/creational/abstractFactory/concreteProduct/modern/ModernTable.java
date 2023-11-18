package creational.abstractFactory.concreteProduct.modern;

import creational.abstractFactory.abstractProduct.ITable;

public class ModernTable implements ITable {
    @Override
    public void hasLegs() {
        System.out.println("Modern table has 0 legs");
    }

    @Override
    public void putOn() {
        System.out.println("Putting on a modern table");
    }
}
