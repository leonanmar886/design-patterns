package creational.abstractFactory.concreteFactory.industrial;

import creational.abstractFactory.IAbstractFactory;
import creational.abstractFactory.abstractProduct.IChair;
import creational.abstractFactory.abstractProduct.ISofa;
import creational.abstractFactory.abstractProduct.ITable;
import creational.abstractFactory.concreteProduct.industrial.IndustrialChair;
import creational.abstractFactory.concreteProduct.industrial.IndustrialSofa;
import creational.abstractFactory.concreteProduct.industrial.IndustrialTable;

public class ConcreteIndustrialFactory implements IAbstractFactory {
    @Override
    public IChair createChair() {
        return new IndustrialChair();
    }

    @Override
    public ISofa createSofa() {
        return new IndustrialSofa();
    }

    @Override
    public ITable createTable() {
        return new IndustrialTable();
    }
}
