package br.com.stef.eclipse.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import com.gs.collections.api.list.MutableList;

public class TestaPet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pet pet = new Pet();
		
		pet.setType(PetType.DOG);
		pet.setName("REX");
		pet.setAge(0);
		
		
		List<Pet> pets = new ArrayList<>();
		pets.add(pet);
		
		Person person = new Person();
		
		
		
		
		
		person.setFirstName("Stefanos");
		person.setLastName("Pavlidis");
		person.setPets(pets);
		
		System.out.println(person);
		
		
		
		
	}

}
