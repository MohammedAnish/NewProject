package EncapAndUserDefinedListMapSet;

import java.util.*;

public class Test{

	
		public static void main(String[] args) {
			Set <Employee> s=new HashSet<>();
			
			Employee e1=new Employee();
			e1.setId(10);
			e1.setName("Anish");
			e1.setPhno(6878899873l);
			Employee e2=new Employee();
			e2.setId(20);
			e2.setName("Mohammad");
			e2.setPhno(98765432119l);
			s.add(e1);
			s.add(e2);
			for (Employee d : s) {
				System.out.println(d.getId());
			}
		}

}
