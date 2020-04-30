package lessons.lesson2;

import javax.sound.midi.Soundbank;
import java.net.SocketTimeoutException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //new Car("Audi","Audi TT", 1.8 ,60)
        Car car1 = new Car("Audi", "Audi TT", 1.8, 60.0);

        Car car2 = new Car();
        car2.model = "BMW";
        car2.brand = "Golf";

        Car car3 = new Car();

        Car car4 = new Car("MINI", "cooper", 1.6, 60.0);

        Car car5 = new Car();
        car5.model = "Opel";
        car5.brand = "Astra";

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        ///////////////////////////PC////////////////
        PC pc1 = new PC("Lenovo", 12.5, 2, 1200.0, "i3");
        PC pc2 = new PC("Asus", 12.5, 4, 1200.0, "core2duo");
        PC pc3 = new PC("Lenovo", 12.5, 2, 1200.0, "i7");
        PC pc4 = new PC("Asus", 12.5, 8, 1200.0, "i5");
        PC pc5 = new PC("HP", 12.5, 2, 1200.0, "i3");
        PC pc6 = new PC("Asus", 12.5, 8, 1200.0, "i5");
        PC pc7 = new PC("Lenovo", 12.5, 4, 1200.0, "core2duo");
        PC pc8 = new PC("Asus", 12.5, 4, 1200.0, "i5");
        PC pc9 = new PC("HP", 12.5, 8, 1200.0, "core2duo");
        PC pc10 = new PC("Asus", 12.5, 8, 1200.0, "i5");

        //PC[] pcs ={pc1,pc2,pc3,pc4,pc5,pc6,pc7,pc8,pc9,pc10};
        PC[] pcs = new PC[10];
        pcs[0] = pc1;
        pcs[1] = pc2;
        pcs[2] = pc3;
        pcs[3] = pc4;
        pcs[4] = pc5;
        pcs[5] = pc6;
        pcs[6] = pc7;
        pcs[7] = pc8;
        pcs[8] = pc9;
        pcs[9] = pc10;
        System.out.println("all objects from pcs");
        System.out.println(Arrays.toString(pcs));

        /*
        3. при помощи циклов for, foreach, while выести все объекты из задания 2.
         */
        System.out.println("Answer 3th question");
        for (int i = 0; i < pcs.length; i++) {
            System.out.println(pcs[i]);
        }
        System.out.println("foreach");
        for (PC pc : pcs) {
            System.out.println(pc);
        }

        System.out.println("while");
        int ii = 0;
        while (ii < pcs.length) {
            PC pc = pcs[ii];
            System.out.println(pcs[ii]);
            ii++;
        }
     /*
     4. при помощи цикла for выести все объекты из задания 2 у которых производитель asus.
      */
        System.out.println("Answer 4th question");
        for (int i = 0; i < pcs.length; i++) {
            if (pcs[i].brand == "Asus") {
                System.out.println(pcs[i]);
            }
        }

        /*
        5. при помощи цикла foreach выести все объекты из задания 2 у которых i3 процессор.
         */
        System.out.println("Answer 5th question");
        for (PC pc : pcs) {
            if (pc.processor_model == "i3") {
                System.out.println(pc);
            }
        }

        /*
        6. при помощи цикла while выести все объекты из задания 2 у которых объем памяти более 4гб.
         */
        System.out.println("Answer 6th question");
        int i = 0;
        while (i < pcs.length) {
            PC pc = pcs[i];
            if (pc.memory_size > 4) {
                System.out.println(pcs[i]);
            }
            i++;
        }

        /*
        7. при помощи любого цикла  выести все объекты из задания 2
        у которых объем памяти более 4гб и производитель HP.
         */
        System.out.println("Answer 7th question");
        for (i = 0; i < pcs.length; i++) {
            if (pcs[i].brand == "HP" && pcs[i].memory_size > 4) {
                System.out.println(pcs[i]);
            }
        }

        /*
        8. создать массив из 10 чисел.
-- вывести его в консоль
-- вывести только парные числа
-- вывести цифры у которых парный индекс
-- при помощи цикла найти сумму всех чисел в массиве
-- при помощи цикла найти среднее арифметическое число массива
         */

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array1));
        int k = array1.length;
        for (i = 0; i < k; i++) {
            if (array1[i] % 2 == 0) {
                System.out.println("только парные числа");
                System.out.println(array1[i]);
            }
        }
        System.out.println("цифры у которых парный индекс");
        for (i = 0; i < k; i++) {
            if (i % 2 == 0) {
                System.out.println(array1[i]);
            }}
        System.out.println("сумму всех чисел в массиве");
        int sum = 0;
        for (i = 0; i < k; i++) {
             sum = sum +array1[i];
        }
        System.out.println(sum);

        /*
        среднее арифметическое число массива
         */
        int sa = sum/k;
        System.out.println("среднее арифметическое число массива = " + sa);
        
        
        /*
        *** создать два числовых массива одинаковой длинны. 
        * Сложить их числа с одинаковыми индексами и вывести в консоль пример
    [1 ,2 ,3 , 4]
    [11,22,33,44]
    12 24 36 48
         */
        int[] x = {1, 2, 3, 4};
        int[] y = {11, 22, 33, 44};
        int[]z = new int[4];
        for (int j = 0; j < x.length; j++) {
            z[j]=x[j]+y[j];
        }
        System.out.println(Arrays.toString(z));
        }
}
