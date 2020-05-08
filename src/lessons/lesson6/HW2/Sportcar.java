package lessons.lesson6.HW2;

public class Sportcar extends Car {
    int horse_power;
    String engine;

    public void speed(){
        System.out.println("my speed is" + this.horse_power);
    }

    public Sportcar() {
    }

    public Sportcar(int id, int plate_number, String brand, int horse_power, String engine) {
        super(id, plate_number, brand);
        this.horse_power = horse_power;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Sportcar{" +
                "horse_power=" + horse_power +
                ", engine='" + engine + '\'' +
                "} " + super.toString();
    }

    @Override
    public void start() {
        System.out.println("Turn on sport car");
    }
}
