package lessons.lesson6.HW2;

import java.util.Objects;

public class Car {
    int id;
    int plate_number;
    String brand;

    public void start(){
        System.out.println("Car is starting to work");
    }

    public Car() {
    }

    public Car(int id, int plate_number, String brand) {
        this.id = id;
        this.plate_number = plate_number;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                plate_number == car.plate_number &&
                brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, plate_number, brand);
    }


    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", plate_number=" + plate_number +
                ", brand='" + brand + '\'' +
                '}';
    }
}
