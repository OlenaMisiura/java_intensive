package lessons.lesson6.HW3;

public class Main {
    public static void main(String[] args) {
        Animal animal1= new Animal("Cat","kitty");
        animal1.breath();

        Animal animal2=new Mammals("Donkey","donkey_type","horse",1);
        animal2.breath();

        Human human1=new Human();
        human1.breath();

        Monkey monkey1=new Monkey();
        monkey1.breath();

        Monkey chimpanzee1=new Chimpanzee();
        chimpanzee1.breath();

        Animal animal3= new Chimpanzee();
        animal3.breath();
    }
}
