package Collection;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<Integer,String>();
		map.put(11, "horn");
		map.put(5, "Apple");
		map.put(2, "Bat");
		map.put(6, "Cat");
		map.put(1, "Dog");
		map.put(3, "Elephant");
		map.put(5, "Fish");
		map.put(7, "Goat");
		System.out.println(map);
		System.out.println(map.isEmpty());
		System.out.println(map.containsKey(11));
		System.out.println(map.containsValue("Goat"));
		System.out.println(map.get(2));
		System.out.println(map.hashCode());
	     map.remove(3);
	     System.out.println(map);
	     HashMap<Integer,String>map1=new HashMap<Integer,String>();
		  map1=(HashMap)map.clone();
		  System.out.println(map1);
          Iterator it=map.entrySet().iterator();
  		while(it.hasNext())
  		{
  			System.out.println(it.next());
  		}

	}

}
