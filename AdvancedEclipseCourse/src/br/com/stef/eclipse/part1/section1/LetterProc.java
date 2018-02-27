package br.com.stef.eclipse.part1.section1;

import javax.swing.JOptionPane;

public class LetterProc {
	
	public static void main(String[] args) {
		
		char ch = JOptionPane.showInputDialog("Enter a character").charAt(0);
		if(Character.isLetter(ch)) {
			System.out.println("Hello");
		}
		
		
	}

}
