package lessons.lesson9.hw2;

public class Motor {

    private String model_motor;
    private double volume_motor;  //1.8
    private int horse_power;     //210

    public Motor() {
    }

    public Motor(String model_motor, double volume_motor, int horse_power) {
        this.model_motor = model_motor;
        this.volume_motor = volume_motor;
        this.horse_power = horse_power;
    }


    @Override
    public String toString() {
        return "Motor{" +
                "model_motor='" + model_motor + '\'' +
                ", volume_motor=" + volume_motor +
                ", horse_power=" + horse_power +
                '}';
    }
}
