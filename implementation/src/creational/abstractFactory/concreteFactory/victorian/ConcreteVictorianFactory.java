package creational.abstractFactory.concreteFactory.victorian;

import creational.abstractFactory.IAbstractFactory;
import creational.abstractFactory.abstractProduct.IChair;
import creational.abstractFactory.abstractProduct.ISofa;
import creational.abstractFactory.abstractProduct.ITable;
import creational.abstractFactory.concreteProduct.victorians.VictorianChair;
import creational.abstractFactory.concreteProduct.victorians.VictorianSofa;
import creational.abstractFactory.concreteProduct.victorians.VictorianTable;

public class ConcreteVictorianFactory implements IAbstractFactory {
    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ISofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public ITable createTable() {
        return new VictorianTable();
    }
}
