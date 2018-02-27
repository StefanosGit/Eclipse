package br.com.stef.eclipse.part3.section1;

public class SplitProc {

	public static void main(String[] args) {
		
		String sentence = "It is a random sentence";
		
		String arr[] = sentence.split(" ");
		System.out.println(arr.length);
		
		for(String word:arr) {
			System.out.println(word);
		}

	}

}
