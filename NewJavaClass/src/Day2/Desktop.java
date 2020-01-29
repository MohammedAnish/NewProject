package Day2;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size always should be medium in size");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}
