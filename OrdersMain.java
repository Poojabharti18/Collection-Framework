package Collection;

import java.util.HashMap;
import java.util.Map;


public class OrdersMain {


		public static void main(String[] args) {
			Orders o1=new Orders(1234,"chair",89);
			Orders o2=new Orders(12345,"Kidschair",189);
			Orders o3=new Orders(12346,"TableMate",289);
			HashMap<Integer,Orders>map=new HashMap<Integer,Orders>();
			map.put(o1.getOrderId(), o1);
			map.put(o2.getOrderId(), o2);
			map.put(o3.getOrderId(), o3);
			for(Map.Entry<Integer, Orders>m:map.entrySet())
			{
				System.out.println(m);
			}

	}

}
