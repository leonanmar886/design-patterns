package creational.abstractFactory.concreteFactory.modern;

import creational.abstractFactory.IAbstractFactory;
import creational.abstractFactory.abstractProduct.IChair;
import creational.abstractFactory.abstractProduct.ISofa;
import creational.abstractFactory.abstractProduct.ITable;
import creational.abstractFactory.concreteProduct.modern.ModernChair;
import creational.abstractFactory.concreteProduct.modern.ModernSofa;
import creational.abstractFactory.concreteProduct.modern.ModernTable;

public class ConcreteModernFactory implements IAbstractFactory {
    @Override
    public IChair createChair() {
        return new ModernChair();
    }

    @Override
    public ISofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public ITable createTable() {
        return new ModernTable();
    }
}
