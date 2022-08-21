package Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class PracticeLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list2=new LinkedList<Integer>();
		list2.add(77);
		list2.add(78);
		list2.add(245);
		list2.add(79);
		list2.add(100);
		System.out.println(list2);
		list2.addAll(list2);
		System.out.println(list2);
		list2.remove(1);
		System.out.println(list2);
		list2.add(4,5678);
		System.out.println(list2);
		list2.clone();
		System.out.println(list2);
		System.out.println(list2.isEmpty());
		System.out.println(list2.size());
		System.out.println(list2.contains(567));
		System.out.println(list2.get(7));
		list2.set(0, 1001);
		System.out.println(list2);
		LinkedList<Integer>list1=new LinkedList<Integer>();
        list1.add(67);
        list1.add(245);
        list1.add(100);
        System.out.println(list1);
        list2.retainAll(list1);
        System.out.println(list2);
        for(Integer i:list1)
        {
        	System.out.println(i);
        }
		
		
		
		
		

	}

	
}
