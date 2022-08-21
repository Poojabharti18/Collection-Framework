package Collection;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		NavigableSet<Integer>set=new TreeSet<Integer>();
		set.add(12);
		set.add(13);
		set.add(14);
		set.add(15);
		set.add(16);
		set.add(17);
		System.out.println(set);
		System.out.println(set.last());
		System.out.println(set.first());
		System.out.println(set.higher(12));
		System.out.println(set.lower(17));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set);
		System.out.println(set.ceiling(16));
		System.out.println(set.floor(14));

	}

}
