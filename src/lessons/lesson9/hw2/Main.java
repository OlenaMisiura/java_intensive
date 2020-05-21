package lessons.lesson9.hw2;

import java.util.ArrayList;
import java.util.Comparator;

/*
Створити колекцію авто яка буде посортивана за роком випуску
Пройтись по коллекції, всі автівки які меньше 2000 року
змінити радіус колеса на одн меньше від поточного
всі автівки які старіше 2000 року пепефарбувати в зелений
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Auto> list =new ArrayList<>();
        Motor motor = new Motor("blabla",1.8,210);
        Wheel wheel=new Wheel("blaaa",15);
        list.add(new Auto("Audi",2019,"3456MA","orange",motor,wheel));
        list.add(new Auto("BMW",1999,"MN3456MA","silver",new Motor("ih67",2.0,180),new Wheel("nkj7",8)));
        list.add(new Auto("Cooper",2019,"LK34676MA","red",new Motor("jh76",1.6,160),new Wheel("nhu7v",10)));


        for (Auto auto : list) {
            if (auto.getYear()<2000) {
              //  int updated=auto.getWheel().getWheel_radius()+1;
                auto.getWheel().setWheel_radius(auto.getWheel().getWheel_radius()+1);
            }

        }

        for (Auto auto : list) {
            if (auto.getYear()>2000){
                auto.setColor("green");
            }

        }

        list.sort(new Comparator<Auto>() {
            @Override
            public int compare(Auto o1, Auto o2) {
                return o1.getYear()-o2.getYear();
            }
        });

        System.out.println(list);
    }
}
