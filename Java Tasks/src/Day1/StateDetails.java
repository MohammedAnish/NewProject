package Day1;

public class StateDetails {
private void southIndia() {
	System.out.println("southIndia");
}
private void northIndia() {
	System.out.println("northIndia");
}

public static void main(String[] args) {
	StateDetails s=new StateDetails();
	LanguageInfo l=new LanguageInfo();
	s.northIndia();
	s.southIndia();
	l.tamilLanguage();
	l.englishLanguage();
}
}
