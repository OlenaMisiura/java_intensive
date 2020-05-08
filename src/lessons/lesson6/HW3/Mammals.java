package lessons.lesson6.HW3;

public class Mammals extends Animal{
    String body;
    int amount_babies;

    public Mammals() {
    }

    public Mammals(String name, String species, String body, int amount_babies) {
        super(name, species);
        this.body = body;
        this.amount_babies = amount_babies;
    }

    @Override
    public void breath() {
        System.out.println("Mammals breathing system");
    }
}
