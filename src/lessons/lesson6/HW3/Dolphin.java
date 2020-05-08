package lessons.lesson6.HW3;

public class Dolphin extends Mammals{
    int fins;
    String location;

    public Dolphin() {
    }

    public Dolphin(String name, String species, String body, int amount_babies, int fins, String location) {
        super(name, species, body, amount_babies);
        this.fins = fins;
        this.location = location;
    }

    @Override
    public void breath() {
        System.out.println("Dolphins breath intake");
    }
}
