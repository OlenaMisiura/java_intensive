package lessons.lesson8;

public abstract class Calculator {

    public String s; // just to try abstract variable
    public int a; //one of variables (for the circle is will be R-radius, for triangle is one of side ect...)

    public Calculator() {
    }

    public Calculator(int a) {
        this.a = a;
    }

    public Calculator(String s, int a) {
        this.s = s;
        this.a = a;
    }

    public abstract double count();

    public void info() {
        System.out.println("Info");
    }
}
