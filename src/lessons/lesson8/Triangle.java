package lessons.lesson8;

public class Triangle extends Calculator{
  //  int a;
    int b;
    int c;

    public Triangle() {
    }

    public Triangle(int a, int b, int c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    @Override
    public double count() {
        return super.a*b*c;
    }
}
