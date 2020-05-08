package lessons.lesson6.HW1;

import java.util.Objects;

public class PC {
    int id;
    String brand;
    double monitor_diagonal;

    public void turnOn(){
        System.out.println("this pc is on - id" + this.id);
    }

    public PC() {
    }

    public PC(int id, String brand, double monitor_diagonal) {
        this.id = id;
        this.brand = brand;
        this.monitor_diagonal = monitor_diagonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PC pc = (PC) o;
        return id == pc.id &&
                Double.compare(pc.monitor_diagonal, monitor_diagonal) == 0 &&
                Objects.equals(brand, pc.brand);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMonitor_diagonal() {
        return monitor_diagonal;
    }

    public void setMonitor_diagonal(double monitor_diagonal) {
        this.monitor_diagonal = monitor_diagonal;
    }


    @Override
    public String toString() {
        return "PC{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", monitor_diagonal=" + monitor_diagonal +
                '}';
    }
}
