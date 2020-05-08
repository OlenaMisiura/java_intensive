package lessons.lesson6.HW3;

public class Human  extends Mammals{
    String functions;

    public Human() {
    }

    public Human(String name, String species, String body, int amount_babies, String functions) {
        super(name, species, body, amount_babies);
        this.functions = functions;
    }

    @Override
    public void breath() {
        System.out.println("Human breath system");
    }
}
