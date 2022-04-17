package org.lang;

public class LanguageInfo extends StateDetails {
	public void tamilLanguage() {
		System.out.println("tamil language : tamilnadu");

	}
	public void englishLanguage() {
		
System.out.println("english language : usa , uk");
	}
	public void hindiLanguage() {
		System.out.println("hindi : north india ");
		

	}
	public static void main(String[] args) {
		LanguageInfo li = new LanguageInfo();
		li.tamilLanguage();
		li.englishLanguage();
		li.hindiLanguage();
		li.southIndia();
		li.northIndia();
	}
}
