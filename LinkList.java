
import java.util.*;

public class LinkList {

    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        System.out.println(l1);
        l1.remove(2);
        System.out.println(l1);
        l1.add(2, 100);
        System.out.println(l1);
        

    }
}
