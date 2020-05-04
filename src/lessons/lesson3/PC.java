package lessons.lesson3;
/*8. Используя класс и спрашиваю домашнего задания которые
характеризирует компьютер создайте массив из 10 различных компьютеров.
Создайте метод который будет приниматьмассив этих компьютеров и
выводить только те объекты объем оперативной памяти которых больше чем 4 ГБ.
 */

public class PC {
    String brand;
    double monitor_diagonal;
    int memory_size;
    double processor_frequency;
    String processor_model;

    public PC() {
    }

    public PC(String brand, double monitor_diagonal, int memory_size, double processor_frequency, String processor_model) {
        this.brand = brand;
        this.monitor_diagonal = monitor_diagonal;
        this.memory_size = memory_size;
        this.processor_frequency = processor_frequency;
        this.processor_model = processor_model;
    }

    @Override
    public String toString() {
        return "PC{" +
                "brand='" + brand + '\'' +
                ", monitor_diagonal=" + monitor_diagonal +
                ", memory_size=" + memory_size +
                ", processor_frequency=" + processor_frequency +
                ", processor_model='" + processor_model + '\'' +
                '}';
    }
}



