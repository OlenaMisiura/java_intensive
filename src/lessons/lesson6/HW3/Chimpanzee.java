package lessons.lesson6.HW3;

public class Chimpanzee extends Monkey{

    String sub_types;

    public Chimpanzee() {
    }

    public Chimpanzee(String name, String species, String body, int amount_babies, String type, String sub_types) {
        super(name, species, body, amount_babies, type);
        this.sub_types = sub_types;
    }

    @Override
    public void breath() {
        System.out.println("Chimpanzee system breathing");
    }
}
