package Collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		set.add("hai");
		set.add("hello");
		set.add("welcome");
		set.add("hai");
		set.add("jack");
		System.out.println(set);
		

	}

}
