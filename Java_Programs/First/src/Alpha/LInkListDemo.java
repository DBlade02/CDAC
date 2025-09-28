package Alpha;

import java.util.*;

public class LInkListDemo {

	public static void main(String[] args)throws Exception {
		List<String> list = new LinkedList<>();
		list.add("Jammu");
		list.add("Maharashtra");
		list.add("Kolkata");
		list.add("India");
		list.add("Hyd");
		System.out.println(list);
		ListIterator lit = list.listIterator();
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
	}
}
