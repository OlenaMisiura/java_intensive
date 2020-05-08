package lessons.lesson6.HW2;

public class MiniVan  extends Car{
    int wheels;
    String van;

    public MiniVan() {
    }

    public MiniVan(int id, int plate_number, String brand, int wheels, String van) {
        super(id, plate_number, brand);
        this.wheels = wheels;
        this.van = van;
    }

    @Override
    public void start() {
        System.out.println("Start mini van");
    }
}
