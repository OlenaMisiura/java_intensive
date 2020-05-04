package lessons.lesson5;


import lessons.lesson5.lombok.PCs;

public class Main {
    public static void main(String[] args) {


     PC pc=new PC(1,"Apple",2.3,4,2.3,"re4");
    // pc.setId(2);
    // pc.getId("bla");
    int id = pc.getId("1234");
    System.out.println(id);


    //
        PCs pc1= new PCs(1,"Apple");
        PCs pc2 = new PCs(2,"Apple");

//        PCs pc3 = pc1;
//        System.out.println(pc3==pc2);

        System.out.println(pc1.equals(pc2));
    }
}
