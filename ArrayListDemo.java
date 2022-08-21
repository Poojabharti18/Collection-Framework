package Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Character>list=new ArrayList<Character>();
		list.add('h');
		list.add('k');
		list.add('j');
		System.out.println(list);
		ArrayList<Character>list1=new ArrayList<Character>();
		list1.add('r');
		list1.add('k');
		list1.add('j');
		System.out.println(list1);
		System.out.println("=====================after");
		list.retainAll(list1);
			System.out.println(list);
			Iterator<Character>it=list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}

			

		}

	

	}


