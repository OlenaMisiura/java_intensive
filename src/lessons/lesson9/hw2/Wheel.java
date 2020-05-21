package lessons.lesson9.hw2;

public class Wheel {

private String wheel_producer;
private int wheel_radius;

    public Wheel() {
    }

    public Wheel(String wheel_producer, int wheel_radius) {
        this.wheel_producer = wheel_producer;
        this.wheel_radius = wheel_radius;
    }

    public String getWheel_producer() {
        return wheel_producer;
    }

    public void setWheel_producer(String wheel_producer) {
        this.wheel_producer = wheel_producer;
    }

    public int getWheel_radius() {
        return wheel_radius;
    }

    public void setWheel_radius(int wheel_radius) {
        this.wheel_radius = wheel_radius;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "wheel_producer='" + wheel_producer + '\'' +
                ", wheel_radius=" + wheel_radius +
                '}';
    }
}
