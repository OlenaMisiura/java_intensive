package lessons.lesson8;

public class Circle extends Calculator {

int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double count() {
        return Math.PI *(r*r);
    }
}
