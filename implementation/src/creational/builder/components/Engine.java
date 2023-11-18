package creational.builder.components;

public class Engine {
    private final String type;
    private final int power;
    private final int torque;

    public Engine(String type, int power, int torque) {
        this.type = type;
        this.power = power;
        this.torque = torque;
    }

    public String getType() {
        return type;
    }

    public int getPower() {
        return power;
    }

    public int getTorque() {
        return torque;
    }
}
