package br.com.stef.eclipse.part1.section1;

import javax.swing.JOptionPane;

public class WhiteSpaceProc {

	public static void main(String[] args) {
		
		char ch = JOptionPane.showInputDialog("Enter a Character").charAt(0);
		boolean test = Character.isWhitespace(ch);
		
		System.out.println(test);
		

	}

}
