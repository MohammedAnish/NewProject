package Day3;

public class Employee {
	private void empId(int no) {
		System.out.println("empId is "+no);
	
}
	private void empId(String name) {
		
System.out.println("name is "+name);
	}

	private void empId(int desgno,String Email ) {
		
System.out.println("desgno & Email:"+desgno+"\t"+Email);
	}
	
	private void empId(char ch,long ph,String add,int val ) {
		
System.out.println("Blood group:"+ch+"ph no"+ph+"String"+add+"Door no"+val );
	}
	
	
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId(100);
	e.empId("JAVA");
	e.empId(100, "Email");
	e.empId('A', 9876498777l, "TYTY", 98);
}

}


