package lessons.lesson8;

public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(2,2,5);
        System.out.println(triangle.count());
        triangle.info();// метод з абстрактного класу

        Circle circle=new Circle();
        circle.r=3;
        System.out.println(circle.count());

        Square square=new Square();
        square.a=2;
        square.b=3;
        System.out.println(square.count());

    }
}
