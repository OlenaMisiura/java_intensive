package lessons.lesson9.hw2;

public class Auto {

    private String model;
    private int year;
    private String number;
    private String color;
    private Motor motor;
    private Wheel wheel;


    public Auto() {
    }

    public Auto(String model, int year, String number, String color, Motor motor, Wheel wheel) {
        this.model = model;
        this.year = year;
        this.number = number;
        this.color = color;
        this.motor = motor;
        this.wheel = wheel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", number='" + number + '\'' +
                ", color='" + color + '\'' +
                ", motor=" + motor +
                ", wheel=" + wheel +
                '}';
    }
}
