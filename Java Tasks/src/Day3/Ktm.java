package Day3;

public class Ktm implements Bike {
	public void cost() {
		System.out.println("COST in class");

	}
	
	public void speed() {
		System.out.println("SPEED in class");

	}
	@Override
	public void chumma() {
		System.out.println("CHUMMA");
		
	}
	
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
		k.chumma();
	}

	
		
	}
	
	
	
	
	
	
	
	

