package lessons.lesson8;

public class Square extends Calculator{
    int a;
    int b;

    public Square() {
    }

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double count() {
        return a * b;
    }
}
