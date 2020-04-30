package lessons.lesson3;

public class ArraySumaAvg {
/*
6. Создайте метод который принимает массив и находит сумму всех элементов.
 */
    public int sum (int[]x){
        int sum =0;
        for (int i = 0;i<x.length; i++){
         sum= sum + x[i];
        }
        return sum;
    }

    /*
    7. Создайте метод который принимает массив и находит среднеарифметическое и возвращает его.
     */
    public double average (int[]x){
        double sum =0;
        for (int i = 0;i<x.length; i++){
            sum= sum + x[i];
        }
        return sum/x.length;
    }
}
