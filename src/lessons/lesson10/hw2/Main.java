package lessons.lesson10.hw2;

import java.util.TreeSet;

/*
Створити колекцію авто яка буде посортивана за роком випуску
Пройтись по коллекції, всі автівки які меньше 2000 року
змінити радіус колеса на одн меньше від поточного
всі автівки які younger 2000 року ->2000++ пепефарбувати в зелений
 */
public class Main {
    public static void main(String[] args) {

        TreeSet<Auto> treeSet =new TreeSet<>();
        Motor motor = new Motor("blabla",1.8,210);
        Wheel wheel=new Wheel("blaaa",15);
        treeSet.add(new Auto("Audi",2019,"3456MA","orange",motor,wheel));
        treeSet.add(new Auto("BMW",1999,"MN3456MA","silver",new Motor("ih67",2.0,180),new Wheel("nkj7",8)));
        treeSet.add(new Auto("Cooper",2020,"LK34676MA","red",new Motor("jh76",1.6,160),new Wheel("nhu7v",10)));
        treeSet.add(new Auto("Sitroen",1998,"LK34676MA","red",new Motor("jh76",1.6,160),new Wheel("nhu7v",9)));


        for (Auto auto : treeSet) {
            if (auto.getYear()<2000) {
              //  int updated=auto.getWheel().getWheel_radius()+1;
                auto.getWheel().setWheel_radius(auto.getWheel().getWheel_radius()-1);
            }

        }

        for (Auto auto : treeSet) {
            if (auto.getYear()>2000){
                auto.setColor("green");
            }

        }

        System.out.println(treeSet);
    }
}
