package lessons.lesson6.HW1;

public class Main {
    public static void main(String[] args) {
        PC pc1= new PC(1,"Apple",3.4);
        pc1.turnOn();

        Laptop laptop1= new Laptop(2,"Dell",2.4,23,3.5,"i5");
        int memory_size = laptop1.getMemory_size();
        System.out.println(memory_size);
        laptop1.processor();
        laptop1.turnOn();
    }
}
