package org.springframework.samples.petclinic.owner;

import java.util.HashSet;
import java.util.Set;

public record OwnerDto(Integer id, String address, String city, String telephone, Set<Pet> pets,
		String firstName, String lastName) {
	
	public static OwnerDto newOwnerFactory() {
		return new OwnerDto(0, "", "", "", new HashSet<Pet>(), "", "");
	}
}
