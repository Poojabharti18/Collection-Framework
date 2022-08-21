package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer>v=new Vector<Integer>();
		v.add(12);
		v.add(67);
		v.add(34);
		v.add(90);
		v.add(90);
		System.out.println(v);
		Enumeration<Integer>e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}

	


