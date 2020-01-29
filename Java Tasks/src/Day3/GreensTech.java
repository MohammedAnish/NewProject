package Day3;

public class GreensTech {
private void DataType(int no) {
	System.out.println("No"+"\t"+no);

}

private void DataOrder(int doorNo,String add) {
	System.out.println("Door no and Add :"+doorNo+"\t"+add);
}

private void DataCount(String Contactperson,char Button,long phno) {
	
System.out.println("Contactperson "+Contactperson+"\t"+phno+"\t"+Button);
}

public static void main(String[] args) {
	GreensTech g=new GreensTech();
	g.DataType(90);
	g.DataOrder(56, "CHENNAI");
	g.DataCount("ANISH",'A',87642365L);


}



}
