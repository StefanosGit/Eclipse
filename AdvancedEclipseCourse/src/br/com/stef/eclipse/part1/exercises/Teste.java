package br.com.stef.eclipse.part1.exercises;

public class Teste {

	public static void main(String[] args) {
		
		String fullName = "Stefanos Ramos Pavlidis";
		int index1 = fullName.indexOf(" ");
		int index2 = fullName.lastIndexOf(" ");
		String middleName = fullName.substring(index1, index2).trim();
		String abbv = middleName.charAt(0) + ".";
		
		System.out.println(index1 + " " + index2 + " " + middleName + " " + abbv);
		

	}

}
