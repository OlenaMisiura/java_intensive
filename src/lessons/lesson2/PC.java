package lessons.lesson2;
/*
Создать класс Компьютер с конструкторами и методом toString
Поля. производитель, диагональ монитора, объем памяти, частота процессора, модель процессора
Доступный список производтелией  : HP Asus Lenovo
Доступный список процессоров  : i3 i5 i7 core2duo
Доступный список объемов памяти  : 2, 4, 8
Создать 10 объектов, поместить их в массив.
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
