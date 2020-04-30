package lessons.lesson3;

import java.util.Random;

/*
3. Создайте метод который генерирует массив при желании можете
создать метод который генерирует массив рандомных чисел размером в 10 элементов
с рандомными значениями
 */
public class Array {
    public int[] arrayGenerator(int bound){
        Random random =new Random();
        int[] array ={random.nextInt(bound),random.nextInt(bound),random.nextInt(bound),random.nextInt(bound),
                random.nextInt(bound),random.nextInt(bound),random.nextInt(bound),random.nextInt(bound),random.nextInt(bound),random.nextInt(bound)};
        return array ;
    }
}
