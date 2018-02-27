package br.com.stef.eclipse.optional;

import java.util.List;
import java.util.Optional;

public class Person {
	
	
	private String firstName;
	private String lastName;
	private List<Pet> pets;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public List<Pet> getPets() {
		return pets;
	}
	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}
	
	@Override
	public String toString() {
		
		return "Person [firstName: " + this.firstName + " lastName: " 
		+ this.lastName + " pets: " + this.pets + "]";
	}
	
	
	public static void teste() {
		Optional<Person> optional = 
	}
	
	
}
