package br.com.stef.eclipse.part2.section1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileProc {

	public static void main(String[] args) {
		
		String source = "names2.txt";
		
		
		try {
			
			try(Scanner fileScanner = new Scanner(new File(source))){
				
				String line="", firstName="",lastName="";
				int age = 0;
				
				while(fileScanner.hasNext()) {
					
					line = fileScanner.nextLine();
					
					try(Scanner scanner = new Scanner(line).useDelimiter("#")){
						
						firstName = scanner.next();
						lastName = scanner.next();
						age = scanner.nextInt();
						
						System.out.println(firstName.charAt(0) + ". " + lastName + " " + age);
						
					}
					
				}
				
			}
		}catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.println("N�o achei o arquivo Porra!!");
		}
		
	}

}
