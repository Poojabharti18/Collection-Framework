package Collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer>d=new LinkedList<Integer>();
		d.add(12);
		d.add(13);
		d.add(14);
		d.add(15);
		d.add(17);
		System.out.println(d);
		d.addFirst(10);
		d.addLast(89);
		System.out.println(d);
		d.removeFirst();
		d.removeLast();
		System.out.println(d);
		


	}

}
