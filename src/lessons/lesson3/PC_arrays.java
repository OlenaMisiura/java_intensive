package lessons.lesson3;

public class PC_arrays {

    public PC[] filtered_pc(PC[] pcs){
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
        // int k =0;
        for (int i = 0, pcsLength = array1.length; i < pcsLength; i++) {
            PC pc = array1[i];
            PC pc1 =array2[i];
            added_arrays[i]=new PC(pc.brand+pc1.brand,pc.monitor_diagonal+pc1.monitor_diagonal,pc.memory_size+pc1.memory_size,pc.processor_frequency+pc1.processor_frequency,pc.processor_model+pc1.processor_model);
            i++;
        }
        return added_arrays;

    }

}
