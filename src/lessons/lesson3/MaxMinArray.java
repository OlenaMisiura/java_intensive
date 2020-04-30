package lessons.lesson3;

public class MaxMinArray {

    public int max (int[]x){
        int max =x[0];
        for (int i = 0;i<x.length; i++){
           // System.out.println(x[i]);
            if (x[i]>=max){
                max =x[i];
            }
        }
        return max;
    }
/*
5. Создайте метод который принимает массив и находит из него минимальное значение.
 */
    public int min (int[]x){
        int min = x[0];
        for (int i = 0;i<x.length; i++){
           // System.out.println(x[i]);
            if (x[i]<min){
                min =x[i];
            }
        }
        return min;
    }
}
