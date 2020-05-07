package lessons.lesson5;

import lessons.lesson5.lombok.PCs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


     PC pc1=new PC(1,"Apple",2.3,8,2.3,"re4");
     PC pc2=new PC(2,"HP",4.4,4,2.3,"i5");
     PC pc3 = new PC(3,"Lenovo", 12.5, 2, 1200.0, "i3");
     PC pc4 = new PC(4,"Asus", 12.5, 4, 1200.0, "core2duo");
     PC pc5 = new PC(5,"Lenovo", 12.5, 2, 1200.0, "i7");
     PC pc6 = new PC(6,"Asus", 12.5, 8, 1200.0, "i5");
     PC pc7 = new PC(7,"HP", 12.5, 2, 1200.0, "i3");
     PC[] pcs= {pc1,pc2,pc3,pc4,pc5,pc6,pc7};

     //Get back Id by asking a password
    int id = pc1.getId("12b34");
    System.out.println(id);

    //filter the array of PC
    Arrays_actions filter = new Arrays_actions();
    System.out.println(Arrays.toString(filter.filtered_pc(pcs)));
    //filter with memory volume
         filter.filtered_pc(pcs,2);
    //adding 2 arrays
        System.out.println(Arrays.toString(filter.sorted_2arrays_pcs(pcs,pcs)));

    // Equal 2 objects
        PCs pcs1= new PCs(1,"Apple");
        PCs pcs2 = new PCs(2,"Apple");
        PCs pcs3 = new PCs(2,"Apple");

        System.out.println(pcs3==pcs2);//false cause in different slots of memory

        System.out.println(pcs2.equals(pcs3));// true

    }
}
