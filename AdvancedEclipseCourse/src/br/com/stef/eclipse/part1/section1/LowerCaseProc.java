package br.com.stef.eclipse.part1.section1;

import javax.swing.JOptionPane;

public class LowerCaseProc {

	public static void main(String[] args) {
		
		String word = JOptionPane.showInputDialog("Enter a Word");
		System.out.println(word.toLowerCase());

	}

}