package collections;
import java.util.*;

import multithreading.Customer;

public class ListDemo {
	public static void main(String[] args) {
		List al = new ArrayList();
        System.out.println(al.size()); // 0
        
        al.add(10);
        al.add("ABC");
        al.add(new Customer(10000));
        al.add(null);
        al.add(10); // dup
        
        System.out.println(al);
        
        String[] cities =  {"HYD", "PY","GOA","RKL","DEL"};
        List city = Arrays.asList(cities);
        
        System.out.println(city);
        
        for(Object c:city)
        	System.out.println(c);
        
        // Iterators
        Iterator itr = city.iterator();
        while(itr.hasNext()) {
        	System.out.println(itr.next());
        }
        
        Collections.sort(city);
        System.out.println(city);
	}

}
