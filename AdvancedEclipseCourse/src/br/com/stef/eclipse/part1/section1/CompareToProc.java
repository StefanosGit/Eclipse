package br.com.stef.eclipse.part1.section1;

import javax.swing.JOptionPane;

public class CompareToProc {

	public static void main(String[] args) {

		String name1 = JOptionPane.showInputDialog("Enter a name");
		String name2 = JOptionPane.showInputDialog("Enter another name");
		System.out.println(name1.compareTo(name2));
		if(name1.compareTo(name2)>0) {
			System.out.println(name1 + " then " + name2);
		}else {
			System.out.println(name2 + " then " + name1);
		}
			


	}

}
