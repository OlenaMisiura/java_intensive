package lessons.lesson9.hw3;

import java.util.ArrayList;
import java.util.Comparator;

/*
Створити колекцію автівок
Пройтись по коллекції, всі автівки які меньше 2000 року скопіювати в окоему коллекцію, яка буде посортована
по року автівок в зростанні
Всі автівки , старіше 2000 року скопіювати в коллекцію ,яка буде посортована по року та спаданню
"Склеїти " ці дві коллекції  в одну
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Car> autos =new ArrayList<>();
        Motor motor = new Motor("blabla",1.8,210);
        Wheel wheel=new Wheel("blaaa",15);
        autos.add(new Car("Audi",1998,"3456MA",motor,wheel));
        autos.add(new Car("BMW",1999,"MN3456MA",new Motor("ih67",2.0,180),new Wheel("nkj7",8)));
        autos.add(new Car("Cooper",2019,"LK34676MA",new Motor("jh76",1.6,160),new Wheel("nhu7v",10)));
        autos.add(new Car("Mercedes",2020,"LK34676MA",new Motor("jh76",1.6,160),new Wheel("nhu7v",10)));


        //Всі автівки , старіше 2000 року скопіювати в коллекцію ,яка буде посортована по року та спаданню
        ArrayList<Car> old_autos =new ArrayList<>();
        for (Car auto : autos) {
            if (auto.getYear()<2000){
            old_autos.add(auto);
        }}

            old_autos.sort(new Comparator<Car>() {
                @Override
                public int compare(Car o1, Car o2) {
                    return o2.getYear()-o1.getYear(); //спадання
                }
            });

        //всі автівки які меньше 2000 року скопіювати в окоему коллекцію, яка буде посортована
        //по року автівок в зростанні
        ArrayList<Car>new_cars=new ArrayList<>();
        for (Car auto : autos) {
         if (auto.getYear()>2000){
             new_cars.add(auto);
         }
        }
     new_cars.sort(new Comparator<Car>() {
         @Override
         public int compare(Car o1, Car o2) {
             return o1.getYear()-o2.getYear();
         }
     });


        ArrayList<Car>cars=new ArrayList<>();
        cars.addAll(0,old_autos);
        cars.addAll(cars.size(),new_cars);
}
}
