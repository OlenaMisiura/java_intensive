package lessons.lesson1;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        /*
        1.присвоить каждому из следующих значений свою переменную:
        -100, 200, «hi everyone»,100500, 3.15 , 456.1234, 967453267864, #, true, false
        */

        int ax = -100;
        int bx = 200;
        String c = "Hi everyone";
        double d = 3.15;
        float e = 456.1234F;
        long f = 967453267864L;
        char s = '#';
        boolean t =true;
        boolean ff =false;

       // System.out.println("hi");

        /*
        2. Переменная «а» равна 10, переменная «b» равно 20.
        Выполнить с этими переменными операции сложения, вычитания , деления,
        умножения при условии что первой во всех выражениях будет стоять переменная a ,
        второй — переменная b . Положить все в соответствующий тип.
         */
         int a =10;
         int b = 20;
         int plus = a+b;
         int minus = a-b;
         int multiply = a * b;
         float divide = (float)a/(float)b;

        //int x = (int)321.65;

        /*
        3.  Создать 3 стринговых переменных, каждая из которых соответствует вашему ФИО.
            Соеденить их в одну использую + , вывести в консоль.
            Применить данное задание к ФИО своих родителей.
        */
        String name = "Olena";
        String surname = "Misiura";
        String father_name = "Vasylivna";
        System.out.println(surname+'\n'+ name+'\n' + father_name);

        String mother_name = "Vira";
        String mother_surname = "Misiura";
        String mother_father_name = "Borusivna";
        System.out.println(mother_surname+ System.lineSeparator()+ mother_name+ System.lineSeparator()+ mother_father_name);

        /*
        4.
     Поставьте соответствующий оператор в выражениях что бы получился соответсвующий результат.
    В одинаковых выражениях в задании не использовать два одинаковых оператора
    5 ? 6 -> true
    5 ? 6 -> false
    5 ? 6 -> false
    5 ? 6 -> false
    10 ? 10 -> true
    10 ? 10 -> true
    10 ? 10 -> false
    10 ? 10 -> false
    10 ? 10 -> false
         */
    int x=5;
    int y =6;
        System.out.println(x<y);
        System.out.println(x>y);
        System.out.println(x==y);
        System.out.println(x>=y);
        System.out.println();
    int xx =10;
    int yy =10;
        System.out.println(xx==yy);
        System.out.println(xx>=yy);
        System.out.println(xx!=yy);
        System.out.println(xx<yy);
        System.out.println(xx>yy);

        /*
        5 Напишите код, который находит площадь прямоугольника высота 23см.
        ( переменная height),
        шириной 10см (переменная width),
        значение площади должно хранится в числовой переменной s.
         */
        int height =23;
        int width = 10;
        int s1 = height*width;

        /*
        6
        Напиши код, который находит объем цилиндра высотой 10м (переменная heightC)
         и диаметром основания 4м (dC),
        результат поместите в переменную v.
         */
        double heightC=10;
        double dC= 4;
        double v = Math.PI * Math.pow(dC,2) *heightC;

        /*
        7
    Все параматры получаем с клавиатуры!!!!
    Имитируем поведение пешехода на перекстке.
    Если светофор зеленый - вывести "иди".
    Если светофор желтый - вывести "подожди".
    Если светофор красный - вывести "стой".
    Если светофор в аварийном режиме вывести "делай что хочешь"!
         */
        System.out.println("Enter the colour -g");
        String colour = new Scanner(System.in).nextLine();
        System.out.println("true/false if the road is empty or not");
        boolean isRoadClear = new Scanner(System.in).nextBoolean();
        System.out.println(isRoadClear);
        if(colour.equals("green") && isRoadClear)
        {
            System.out.println("go");
        } else if(colour.equals("green") && !isRoadClear){
            System.out.println("wait until the car is passing");
        }
        else if (colour.equals("yellow")&& isRoadClear)
        {
            System.out.printf("wait");
        }else if (colour.equals("yellow") && !isRoadClear){
            System.out.println("still wait");
        }
        else if (colour.equals("red")&& isRoadClear)
        {
            System.out.println("still stop");
        }
        else if(colour.equals("red")&& !isRoadClear){
            System.out.println("stay and wait");
        }
        else {System.out.println("It's up to u");}
    }
}
