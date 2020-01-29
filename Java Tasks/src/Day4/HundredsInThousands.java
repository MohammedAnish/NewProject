package Day4;

public class HundredsInThousands {

	public void HundredsInThousands() {
		
		for (int i = 0; i <1000; i++) {
			
			if (i%100==0) {
				i=i+100;
			
				System.out.println(i);
			}	
			}
		}
		public static void main(String[] args) {
		HundredsInThousands h=new HundredsInThousands();
		h.HundredsInThousands();
	}	
		
	
	
	
	
	
	
	
	
	
}
