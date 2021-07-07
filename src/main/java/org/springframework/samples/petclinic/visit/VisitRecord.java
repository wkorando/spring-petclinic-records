package org.springframework.samples.petclinic.visit;

import java.time.LocalDate;

public record VisitRecord(Integer id, LocalDate date, String description, Integer petId) implements Visit {
	
	@Override
	public LocalDate getDate() {
		return date;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public Integer getPetId() {
		return petId;
	}

	@Override
	public Integer getId() {
		return id;
	}
	
	public boolean isNew() {
		return this.id == null;
	}
}