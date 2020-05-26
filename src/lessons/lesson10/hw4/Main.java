package lessons.lesson10.hw4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Створити клас Зооклуб.
В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
В мейн методі створити меню, яке буде реалізовувати наступні функції:
1) додати учасника в клуб;
2) додати тваринку до учасника клубу.
 */
public class Main {
    public static void main(String[] args) {
    Zooclub zooclub=new Zooclub();
    Person a =new Person(1,"Vasya","Ivanov");
    Person b =new Person(1,"Vasya","Ivanov");
    Person c =new Person(1,"Vasya","Ivanov");
    Person d =new Person(1,"Vasya","Ivanov");
    Pet pet1=new Pet(1,"Coco","dog");
    Pet pet2=new Pet(2,"Murka","cat");
    Pet pet3=new Pet(3,"Sharik","dog");
    Pet pet4=new Pet(4,"Tom","cat");

        List<Pet> pets =new ArrayList<>();
        pets.add(pet1);
        pets.add(pet2);

        Zooclub club = new Zooclub();
        Map<Person, List<Pet>> zoo = new HashMap<>();
        zoo.put(a,pets);
        club.setClub(zoo);

        System.out.println(club);

    }

    private static void addPerson(Person person){
        Zooclub zooclub =new Zooclub();
        Map<Person, List<Pet>> zoo = new HashMap<>();
        zoo.put(person,null);
        zooclub.setClub(zoo);
    }
}
