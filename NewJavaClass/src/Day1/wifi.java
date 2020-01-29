package Day1;

public class wifi {
public void wifiName() {
System.out.println("Wifi Name is AMER");
}
public static void main(String[] args) {
	wifi w=new wifi();
	w.wifiName();
	MobileData m=new MobileData();
	m.dataName();
	Lan l=new Lan();
	l.lanName();
	Wireless wl=new Wireless();
	wl.modemName();
}
}