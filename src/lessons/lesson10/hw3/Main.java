package lessons.lesson10.hw3;

import java.util.NavigableSet;
import java.util.TreeSet;

/*
Створити колекцію автівок
Пройтись по коллекції, всі автівки які меньше 2000 року скопіювати в окоему коллекцію, яка буде посортована
по року автівок в зростанні
Всі автівки , старіше 2000 року скопіювати в коллекцію ,яка буде посортована по року та спаданню
"Склеїти " ці дві коллекції  в одну
 */
public class Main {
    public static void main(String[] args) {

        TreeSet<Car> autos =new TreeSet<>();
        Motor motor = new Motor("blabla",1.8,210);
        Wheel wheel=new Wheel("blaaa",15);
        autos.add(new Car("Audi",1998,"3456MA",motor,wheel));
        autos.add(new Car("BMW",1999,"MN3456MA",new Motor("ih67",2.0,180),new Wheel("nkj7",8)));
        autos.add(new Car("Cooper",2019,"LK34676MA",new Motor("jh76",1.6,160),new Wheel("nhu7v",10)));
        autos.add(new Car("Mercedes",2020,"LK34676MA",new Motor("jh76",1.6,160),new Wheel("nhu7v",10)));


        //Всі автівки , старіше 2000 року скопіювати в коллекцію ,яка буде посортована по року та спаданню
        TreeSet<Car> old_autos =new TreeSet<>();
        for (Car auto : autos) {
            if (auto.getYear()<2000){
            old_autos.add(auto);
        }}

       // System.out.println(old_autos);
        //всі автівки які меньше 2000 року скопіювати в окоему коллекцію, яка буде посортована
        //по року автівок в зростанні
        TreeSet<Car>new_cars=new TreeSet<>();
        for (Car auto : autos) {
         if (auto.getYear()>2000){
             new_cars.add(auto);
         }
        }
        //System.out.println(new_cars.descendingSet());
        NavigableSet<Car> cars_news=new TreeSet<>();
        cars_news=new_cars.descendingSet();
        System.out.println(cars_news);

        TreeSet<Car>cars=new TreeSet<>();
        cars.addAll(old_autos);
        cars.addAll(cars_news);
        System.out.println(cars);
}
}
