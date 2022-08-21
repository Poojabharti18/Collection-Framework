package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class DemoSort {

	public static void main(String[] args) {
		ArrayList<Integer>list=new ArrayList<Integer>();
		list.add(14);
		list.add(90);
		list.add(56);
		list.add(67);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);

	}

}
