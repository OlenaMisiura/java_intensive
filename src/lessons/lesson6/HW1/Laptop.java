package lessons.lesson6.HW1;

import java.util.Objects;

public class Laptop extends PC{
   private int memory_size;
   private double processor_frequency;
   private String processor_model;

    public void processor()
    {
        System.out.println("this laptop has" + this.processor_model);
    }

    public Laptop() {
    }

    public Laptop(int id, String brand, double monitor_diagonal, int memory_size, double processor_frequency, String processor_model) {
        super(id, brand, monitor_diagonal);
        this.memory_size = memory_size;
        this.processor_frequency = processor_frequency;
        this.processor_model = processor_model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return memory_size == laptop.memory_size &&
                Double.compare(laptop.processor_frequency, processor_frequency) == 0 &&
                processor_model.equals(laptop.processor_model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memory_size, processor_frequency, processor_model);
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "memory_size=" + memory_size +
                ", processor_frequency=" + processor_frequency +
                ", processor_model='" + processor_model + '\'' +
                ", id=" + id +
                ", brand='" + brand + '\'' +
                ", monitor_diagonal=" + monitor_diagonal +
                '}';
    }

    public int getMemory_size() {
        return memory_size;
    }

    public void setMemory_size(int memory_size) {
        this.memory_size = memory_size;
    }

    public double getProcessor_frequency() {
        return processor_frequency;
    }

    public void setProcessor_frequency(double processor_frequency) {
        this.processor_frequency = processor_frequency;
    }

    public String getProcessor_model() {
        return processor_model;
    }

    public void setProcessor_model(String processor_model) {
        this.processor_model = processor_model;
    }

    @Override
    public void turnOn() {
        System.out.println("Laptop is on");
    }
}
