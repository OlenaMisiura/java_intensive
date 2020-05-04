package lessons.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Add add= new Add();
        add.adding(2,8);

        Add cha= new Add();
        System.out.println(cha.cha(5,2,"-"));

        Array array = new Array();
       // array.arrayGenerator(10);
        System.out.println(Arrays.toString(array.arrayGenerator(10)));

        MaxMinArray max =new MaxMinArray();
        Random random =new Random();
        int i =10;
        int[] array1={random.nextInt(i),random.nextInt(i),random.nextInt(i),random.nextInt(i),random.nextInt(i),random.nextInt(i)};
        System.out.println(Arrays.toString(array1));
        System.out.println(max.max(array1)+"= max element");

        System.out.println(max.min(new int[]{1, 2, 3, 4, 5, 6, 7}) + "= min element");


        ArraySumaAvg arraySumaAvg = new ArraySumaAvg();
        System.out.println(Arrays.toString(array1));
        System.out.println(arraySumaAvg.sum(array1) + "= sum");

        System.out.println(arraySumaAvg.average(array1) + "= середньо арифметичне");

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

        PC[] pcs ={pc1,pc2,pc3,pc4,pc5,pc6,pc7,pc8,pc9,pc10};
//        PC[] pcs = new PC[10];
//        pcs[0] = pc1;
//        pcs[1] = pc2;
//        pcs[2] = pc3;
//        pcs[3] = pc4;
//        pcs[4] = pc5;
//        pcs[5] = pc6;
//        pcs[6] = pc7;
//        pcs[7] = pc8;
//        pcs[8] = pc9;
//        pcs[9] = pc10;
        System.out.println("all objects from pcs: ->");
        System.out.println(Arrays.toString(pcs));

        PC_arrays formatting=new PC_arrays();
         //formatting.sorted_pc(pcs);
        System.out.println(Arrays.toString(formatting.filtered_pc(pcs)));

        formatting.filtered_pc(pcs,2);

        System.out.println("Added 2 arrays of PCs");
        System.out.println(Arrays.toString(formatting.sorted_2arrays_pcs(pcs,pcs)));
    }
}
