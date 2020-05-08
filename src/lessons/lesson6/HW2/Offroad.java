package lessons.lesson6.HW2;

import java.util.Objects;

public class Offroad extends Car {
    int wheels;
    String cab;

    public Offroad() {
    }

    public Offroad(int id, int plate_number, String brand, int wheels, String cab) {
        super(id, plate_number, brand);
        this.wheels = wheels;
        this.cab = cab;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Offroad offroad = (Offroad) o;
        return wheels == offroad.wheels &&
                cab.equals(offroad.cab);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wheels, cab);
    }

    @Override
    public void start() {
        System.out.println("Turn on off road car");
    }
}
