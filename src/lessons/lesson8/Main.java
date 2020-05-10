package lessons.lesson8;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        Triangle triangle=new Triangle(2,3,4);
        System.out.println(triangle.count());
        triangle.info();// метод з абстрактного класу

        Circle circle=new Circle();
        circle.a=5;
        System.out.println(circle.count());
        String sentence = circle.s="Variable from abstract class";
        System.out.println(sentence);

        Square square=new Square();
        square.a=2;
        square.b=3;
        System.out.println(square.count());

    }
}
