package br.com.stef.eclipse.part1.section1;

import javax.swing.JOptionPane;

public class UpperCaseProc {

	public static void main(String[] args) {

		String word = JOptionPane.showInputDialog("Enter a word");
		System.out.println(word.toUpperCase());
	}

}
