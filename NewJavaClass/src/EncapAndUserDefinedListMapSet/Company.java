package EncapAndUserDefinedListMapSet;


import java.util.ArrayList;
import java.util.List;

public class Company {
	public static void main(String[] args) {
		List <Employee> L=new ArrayList<>();
		
		Employee e1=new Employee();
		e1.setId(10);
		e1.setName("Anish");
		e1.setPhno(68788998736364l);
		L.add(e1);
		for (int i = 0; i < L.size(); i++) {
			System.out.println(L.get(i).getId());
			System.out.println(L.get(i).getName());
			System.out.println(L.get(i).getPhno());
			
		}
	}

}
