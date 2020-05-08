package lessons.lesson6.HW2;

public class Main {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.start();
        Car car2 = new Sportcar();
        car2.start();
        car2.plate_number=1234;

        Offroad car3 = new Offroad(1,223344,"GGG",4,"cab");
        car3.start();

        MiniVan car4 = new MiniVan();
        car4.start();
    }
}
