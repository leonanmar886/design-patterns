package creational.builder;

import creational.builder.builders.CarConcreteBuilder;

public class Client {
    Director director = new Director();

    CarConcreteBuilder builder = new CarConcreteBuilder();

    void constructSportsCar() {
        director.constructSportsCar(builder);
    }
}
