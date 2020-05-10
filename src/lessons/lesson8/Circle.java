package lessons.lesson8;

public class Circle extends Calculator {

//int r;

    public Circle() {
    }

    public Circle(String s, int a, int r) {
        super(s, a);
    }

    @Override
    public double count() {
        return Math.PI *(super.a*super.a);
    }
}
