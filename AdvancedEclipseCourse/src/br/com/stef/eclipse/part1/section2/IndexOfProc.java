package br.com.stef.eclipse.part1.section2;

public class IndexOfProc {
	
	
	
	public static void main(String[] args) {
		
		String sent = "This is a random sentence";
		String searchWord = "random";
		System.out.println(sent.charAt(3));
		System.out.println(sent.substring(sent.indexOf("random"),sent.indexOf("random")+searchWord.length()));
	}
	

}