package br.com.stef.eclipse.part1.exercises;

import javax.swing.JOptionPane;

public class Exercise2 {

	private static final String ESPACO = " ";
	
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		String fullName = JOptionPane.showInputDialog("Enter Your Full Name");
		person.setFirstName(fullName.substring(0, fullName.indexOf(ESPACO)).trim());
		person.setMiddleName(fullName.substring(fullName.indexOf(ESPACO),fullName.lastIndexOf(ESPACO)).trim());
		person.setLastName(fullName.substring(fullName.lastIndexOf(ESPACO)).trim());
		
		
		System.out.println(person);
		
	}

}
