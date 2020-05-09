package lessons.lesson7;

public class Main {

    public static void main(String[] args) {

        Square square1=new Square(2,2);
        double square = square1.calculate();
        System.out.println(square);


        Circle circle1=new Circle();
        circle1.setR(4);
        double circle = circle1.calculate();
        System.out.println(circle);
        double area =circle1.area(6);
        System.out.println(area);


        Triangle triangle1=new Triangle(2,3,4);
        double triangle = triangle1.calculate();
        System.out.println(triangle);

    }
}
