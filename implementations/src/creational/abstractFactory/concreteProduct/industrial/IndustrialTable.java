package creational.abstractFactory.concreteProduct.industrial;

import creational.abstractFactory.abstractProduct.ITable;

public class IndustrialTable implements ITable {
    @Override
    public void hasLegs() {
        System.out.println("Industrial table has 4 legs");
    }

    @Override
    public void putOn() {
        System.out.println("Putting on a industrial table");
    }
}
