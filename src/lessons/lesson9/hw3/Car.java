package lessons.lesson9.hw3;

public class Car {
    private String model;
    private int year;
    private String number;
    private Motor motor;
    private Wheel wheel;


    public Car() {
    }

    public Car(String model, int year, String number,Motor motor, Wheel wheel) {
        this.model = model;
        this.year = year;
        this.number = number;
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
                ", motor=" + motor +
                ", wheel=" + wheel +
                '}';
    }
}
