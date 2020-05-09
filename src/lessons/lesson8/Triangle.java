package lessons.lesson8;

public class Triangle extends Calculator{
    int a;
    int b;
    int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double count() {
        return a*b*c;
    }
}
