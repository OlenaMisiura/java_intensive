package lessons.lesson5;

public class Arrays_actions {


    public PC[] filtered_pc(PC[] pcs){
        PC[] filtered_pc = new PC[10];
        int k =0;
        for (int i = 0, pcsLength = pcs.length; i < pcsLength; i++) {
            PC pc = pcs[i];
            if (pc.getMemory_size()>4) {
                filtered_pc[k]= pc;
                k++;
            }
        }
        return filtered_pc;
    }

    public void filtered_pc(PC[] pcs, int volume){
        System.out.println("Sorted PCs by memory volume ->");
        for (PC pc : pcs) {
            if (pc.getMemory_size()> volume) {
                System.out.println(pc);
            }
        }
    }

    public PC[] sorted_2arrays_pcs(PC[] array1,PC[] array2){
        PC[] added_arrays = new PC[10];
        // int k =0;
        for (int i = 0, pcsLength = array1.length; i < pcsLength; i++) {
            PC pc = array1[i];
            PC pc1 =array2[i];
            added_arrays[i]=new PC(pc.getId(String.valueOf(1234))+pc.getId(String.valueOf(1234)),pc.getBrand()+pc1.getBrand(),pc.getMonitor_diagonal()+pc1.getMonitor_diagonal(),pc.getMemory_size()+pc1.getMemory_size(),pc.getProcessor_frequency()+pc1.getProcessor_frequency(),pc.getProcessor_model()+pc1.getProcessor_model());
            i++;
        }
        return added_arrays;

    }
}
