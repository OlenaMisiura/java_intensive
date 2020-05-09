package lessons.lesson7;

import static java.lang.Math.*;

public class Circle implements calculateSquare {
   private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    //Длины окружности вычисляется по формуле = 2*PI*radius
    public double area(double r){
        return 2* PI*r;
    }

    @Override
    public double calculate() {
        return PI*r*r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }
}
