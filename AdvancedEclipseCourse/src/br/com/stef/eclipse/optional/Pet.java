package br.com.stef.eclipse.optional;

public class Pet {
	
	
	private PetType type;
	private String  name;
	private int 	age;
	public PetType getType() {
		return type;
	}
	public void setType(PetType type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pet[ PetType: " + this.getType() + " name: " +
				this.name + " age: " + this.age + "]";
	}
	
}