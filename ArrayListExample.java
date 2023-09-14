import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        al.add(23);
        al.add(34);
        al.add(45);

        System.out.println(al);

        ArrayList<Integer> bl = new ArrayList<Integer>();
        bl.add(56);
        bl.add(78);
        bl.add(5);
        bl.add(8);
        System.out.println(bl);
        al.addAll(bl);

        System.out.println(al);

        al.set(1, 99);

        System.out.println(al);

        bl.remove(2);
        System.out.println(bl);




    }
    
}
