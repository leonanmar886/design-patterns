package creational.abstractFactory;

import creational.abstractFactory.abstractProduct.IChair;
import creational.abstractFactory.abstractProduct.ISofa;
import creational.abstractFactory.abstractProduct.ITable;

public interface IAbstractFactory {
    public abstract IChair createChair();
    public abstract ISofa createSofa();
    public abstract ITable createTable();
}
