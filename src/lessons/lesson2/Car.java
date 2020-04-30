package lessons.lesson2;

 /*
1. Cоздать класс который описывает автомобиль.
Поля : модель, производитель, объем двигателя, объём бака.
Создать конструктор без полей и со всеми полями.
Сгенирировать метод toString.
создать 5 объектов. вывести их в консоль
*/
public class Car {
        String model;
        String brand;
        double engine_volume;
        double volume_of_tank;

        public Car() {
        }

        public Car(String model, String brand, double engine_volume, double volume_of_tank) {
            this.model = model;
            this.brand = brand;
            this.engine_volume = engine_volume;
            this.volume_of_tank = volume_of_tank;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", brand='" + brand + '\'' +
                    ", engine_volume=" + engine_volume +
                    ", volume_of_tank=" + volume_of_tank +
                    '}';
        }
    }
