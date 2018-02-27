package br.com.stef.eclipse.part2.section1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class PrintWriterProc {

	public static void main(String[] args) throws IOException {


		String line="",firstName="",lastName="";
		int age=0;
		
		
		try(PrintWriter outFile = new PrintWriter(new FileWriter("hello.txt",true))){
			//outFile.println("Hello World");
			for(int i=0;i<3;i++) {
				firstName = JOptionPane.showInputDialog("Enter your Name");
				lastName = JOptionPane.showInputDialog("Enter your last Name");
				age = Integer.valueOf(JOptionPane.showInputDialog("Enter your age"));
				line = firstName + "#" + lastName + "#" + age;
				outFile.println(line);
			}
			
			
			
		}
	}

}
