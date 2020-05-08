package lessons.lesson6.HW3;

public class Animal {
    String name;
    String species;

    public Animal() {
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public void breath(){
        System.out.println("Breathing fresh air");
    }
}
