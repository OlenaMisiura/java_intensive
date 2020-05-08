package lessons.lesson6.HW3;

public class Monkey extends  Mammals {
    String type;

    public Monkey() {
    }

    public Monkey(String name, String species, String body, int amount_babies, String type) {
        super(name, species, body, amount_babies);
        this.type = type;
    }

    @Override
    public void breath() {
        System.out.println("Monkey breath system");
    }
}
