package lessons.lesson7;

public class Triangle implements СalculateSquare {
  private int a;
  private int b;
  private int c;

  public Triangle() {
  }

  public Triangle(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
    public double calculate() {
    return a*b*c ;
  }

  @Override
  public String toString() {
    return "Triangle{" +
            "a=" + a +
            ", b=" + b +
            ", c=" + c +
            '}';
  }
}
