package lessons.lesson7;

public class Square implements СalculateSquare {
    private    int a;
    private  int b;

    public Square() {
    }

    public Square(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        return  a * b;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
