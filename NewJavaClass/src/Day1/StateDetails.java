package Day1;

public class StateDetails {
public void southIndia() {
	System.out.println("SouthIndia is No 1");
}

public void northIndia() {
	System.out.println("NorthIndia is No 2");
}

public static void main(String[] args) {
	StateDetails s=new StateDetails();
	s.southIndia();
	s.northIndia();
	LanguageInfo l=new LanguageInfo();
	l.tamilLanguage();
	l.englishLanguage();
	l.hindiLangauge();
}
}
