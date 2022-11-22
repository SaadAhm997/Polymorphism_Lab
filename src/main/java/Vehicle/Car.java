package Vehicle;

import interfaces.ICar;

public class Car implements ICar {

    private String name;

    public Car(String name) {
        this.name = name;
    }

    public String rideCar(String time) {
        return "It's time to ride the " + this.name + " " + time;
    }
}