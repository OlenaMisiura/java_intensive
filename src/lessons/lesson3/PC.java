package lessons.lesson3;
/*8. Используя класс и спрашиваю домашнего задания которые
характеризирует компьютер создайте массив из 10 различных компьютеров.
Создайте метод который будет приниматьмассив этих компьютеров и
выводить только те объекты объем оперативной памяти которых больше чем 4 ГБ.
 */

public class PC {
    String brand;
    double monitor_diagonal;
    int memory_size;
    double processor_frequency;
    String processor_model;

    public PC() {
    }

    public PC(String brand, double monitor_diagonal, int memory_size, double processor_frequency, String processor_model) {
        this.brand = brand;
        this.monitor_diagonal = monitor_diagonal;
        this.memory_size = memory_size;
        this.processor_frequency = processor_frequency;
        this.processor_model = processor_model;
    }

    @Override
    public String toString() {
        return "PC{" +
                "brand='" + brand + '\'' +
                ", monitor_diagonal=" + monitor_diagonal +
                ", memory_size=" + memory_size +
                ", processor_frequency=" + processor_frequency +
                ", processor_model='" + processor_model + '\'' +
                '}';
    }

    public PC[] sorted_pc(PC[] pcs){
        PC[] filtered_pc = new PC[10];
        int k =0;
        for (int i = 0, pcsLength = pcs.length; i < pcsLength; i++) {
            PC pc = pcs[i];
            if (pc.memory_size> 4) {
                filtered_pc[k]= pc;
                k++;
            }
        }
        return filtered_pc;
}
/*
9. Используя предыдущее задание усовершенствовать его.
Теперь метод должен принимать массив объектов и числовое значение которая
характеризует значение объема оперативной памяти которая будет является
ограничителем для выведения объектов с соответствующем объемом памяти.
 */
public void filtered_pc(PC[] pcs,int volume){
    System.out.println("Sorted PCs by memory volume ->");
    for (PC pc : pcs) {
        if (pc.memory_size> volume) {
            System.out.println(pc);
        }
    }
}
/*
10. Используя предыдущий метод сгенерировать  два массива. Создайте метод который будет
принимать два массива и складывать между собой значение их соответствующих элементов иными
словами первый элемент из первого массива и первый элемент из второго массива износить
это значение в абсолютно новый массив который будет результирующем. Вернуть этот результирующей массив
 */
public PC[] sorted_2arrays_pcs(PC[] array1,PC[] array2){
    PC[] added_arrays = new PC[10];
    int k =0;
    for (int i = 0, pcsLength = array1.length; i < pcsLength; i++) {
         PC pc = array1[i];
         PC pc1 =array2[i];
           added_arrays[k]=new PC(pc.brand+pc1.brand,pc.monitor_diagonal+pc1.monitor_diagonal,pc.memory_size+pc1.memory_size,pc.processor_frequency+pc1.processor_frequency,pc.processor_model+pc1.processor_model);
            k++;
    }
    return added_arrays;

}

}



