package org.springframework.samples.petclinic.vet;

import java.util.Collection;

public record VetDto(Integer id, String firstName, String lastName, Collection<Specialty> specialties) {

	public int getNrOfSpecialties() {
		return specialties.size();
	}
}