package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"sreeja",23000,"HYd");
		Employee emp2=new Employee(102,"Anu",43000.5f,"CBE");
		Employee emp3=new Employee(103,"Tejal",45000,"Mumbai");
		ArrayList <Employee>list=new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		System.out.println(list);
		 for(Employee e:list)
	        {
	            System.out.println(e);
	        }
	        System.out.println("============================");
	        
	        System.out.println("========================apply sort");
	        Collections.sort(list);
	        for(int i=0;i<list.size();i++)
	        {
	            System.out.println(list.get(i));
	        }
		
	}



	}


