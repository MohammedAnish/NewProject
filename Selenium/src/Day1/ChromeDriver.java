package Day1;

public class ChromeDriver implements webdriver {

	@Override
	public void get() {
		System.out.println("get");
	}

	@Override
	public void getTitle() {
		System.out.println("getTitle");
		
	}

	@Override
	public void findElement() {
		System.out.println("findElement");
	}
	
	public static void main(String[] args) {
		webdriver w=new ChromeDriver();
		w.get();
		w.getTitle();
		w.findElement();
		
	}

}
