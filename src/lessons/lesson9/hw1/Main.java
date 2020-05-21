package lessons.lesson9.hw1;

import java.util.ArrayList;

/*
1=========
Існують наступні об'єкти.
Створити класи під них.
Створити метод , який об'єднує об'єкти з однаковими id в єдиний об'єкт
і повертає вам цей список об'єктів.
Класс під загальний об'єкт рписати самостійно. Він повинен містити тільки необхідні поля


список 1
new Person(1,"vaysa",32);
new Person(2,"petya",31);
new Person(3,"kolya",30);
new Person(4,"anya",29);
new Person(5,"masha",28);
new Person(6,"andriy",30);
new Person(7,"maxim",31);
new Person(8,"vadym",32);
new Person(9,"taras",33);

список 2
new Auth(5,"login5","password5");
new Auth(2,"login2","password2");
new Auth(1,"login1","password1");
new Auth(7,"login7","password7");
new Auth(3,"login3","password3");
new Auth(4,"login4","password4");
new Auth(8,"login8","password8");
new Auth(6,"login6","password6");
new Auth(9,"login9","password9");

список 3 - це результат робботи методу який
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> person=new ArrayList<>();
        person.add(new Person(1,"vasia",32));
        person.add(new Person(2,"petya",31));
        person.add(new Person(3,"kolya",30));
        person.add(new Person(4,"anya",29));
        person.add(new Person(5,"masha",28));
        person.add(new Person(6,"andriy",30));
        person.add(new Person(7,"maxim",31));
        person.add(new Person(8,"vadym",32));
        person.add(new Person(9,"taras",33));

        ArrayList<Auth> auth =new ArrayList<>();
        auth.add(new Auth(5,"login5","password5"));
        auth.add(new Auth(2,"login2","password2"));
        auth.add(new Auth(1,"login1","password1"));
        auth.add(new Auth(7,"login7","password7"));
        auth.add(new Auth(3,"login3","password3"));
        auth.add(new Auth(4,"login4","password4"));
        auth.add(new Auth(8,"login8","password8"));
        auth.add(new Auth(6,"login6","password6"));
        auth.add(new Auth(9,"login9","password9"));

        ArrayList<Conclusion> result = merge(person,auth);
        System.out.println(result);


    }

    //method for merge 2 objects
    public static ArrayList<Conclusion> merge(ArrayList<Person>persons,ArrayList<Auth>auths){
        ArrayList<Conclusion> list = new ArrayList<>();
        for (Person person : persons) {
            for (Auth auth : auths) {
                if (person.getId()==auth.getId()){
                    Conclusion conclusion =new Conclusion(person,auth);
                    list.add(conclusion);
                }
            }
        }
        return list;
    }
}
