package br.com.stef.eclipse.part3.section1;

import javax.swing.JOptionPane;

public class ArrayProc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [5];
		
		for(int i = 0; i < arr.length;i++) {
			arr[i] = Integer.valueOf(JOptionPane.showInputDialog("Enter a Number"));
		}
		
		
		for(int num:arr) {
			System.out.println(num);
		}
		
		
		
	}

}
