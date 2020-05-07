package lessons.lesson5;
/*8. Используя класс и спрашиваю домашнего задания которые
характеризирует компьютер создайте массив из 10 различных компьютеров.
Создайте метод который будет приниматьмассив этих компьютеров и
выводить только те объекты объем оперативной памяти которых больше чем 4 ГБ.
 */

public class PC {
    private int id;
    private String brand;
    private double monitor_diagonal;
    private int memory_size;
    private double processor_frequency;
    private String processor_model;

    public PC(String s, double v, int i, double v1, String s1) {
    }

    public PC(int id, String brand, double monitor_diagonal, int memory_size, double processor_frequency, String processor_model) {
        this.id = id;
        this.brand = brand;
        this.monitor_diagonal = monitor_diagonal;
        this.memory_size = memory_size;
        this.processor_frequency = processor_frequency;
        this.processor_model = processor_model;
    }

    public int getId(String password) {
        if(password.equalsIgnoreCase(String.valueOf(1234))){
        return id;
    } else {System.out.println("Wrong password");}
        return 0;
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
    public String toString() {
        return "PC{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", monitor_diagonal=" + monitor_diagonal +
                ", memory_size=" + memory_size +
                ", processor_frequency=" + processor_frequency +
                ", processor_model='" + processor_model + '\'' +
                '}';
    }
}



