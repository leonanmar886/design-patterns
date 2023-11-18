package creational.abstractFactory.concreteProduct.victorians;

import creational.abstractFactory.abstractProduct.ITable;

public class VictorianTable implements ITable {
    @Override
    public void hasLegs() {
        System.out.println("Victorian table has 6 legs");
    }

    @Override
    public void putOn() {
        System.out.println("Sitting on a victorian table");
    }
}
