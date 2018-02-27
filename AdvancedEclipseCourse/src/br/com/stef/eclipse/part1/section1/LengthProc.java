package br.com.stef.eclipse.part1.section1;

import javax.swing.JOptionPane;

public class LengthProc {

	public static void main(String[] args) {

			String password = JOptionPane.showInputDialog("Enter a password");
			
			if(password.length()>6) {
				System.out.println("password is valid");
			}else {
				System.out.println("passoword is not valid");
			}
			
		
	}

}
