package br.com.stef.eclipse.part1.section2;

import javax.swing.JOptionPane;

public class SubStringProc {
	
	
	public static void main(String[] args) {
		
		String sent = JOptionPane.showInputDialog("Enter a setence");
		System.out.println(sent.substring(5));
		System.out.println(sent.substring(5,10));
	}

}
