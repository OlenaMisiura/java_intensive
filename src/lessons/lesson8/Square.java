package lessons.lesson8;

public class Square extends Calculator{
    int b;

    public Square() {
    }

    public Square(int a, int b) {
        super(a);
        this.b = b;
    }

    @Override
    public double count() {
        return super.a * b;
    }
}
