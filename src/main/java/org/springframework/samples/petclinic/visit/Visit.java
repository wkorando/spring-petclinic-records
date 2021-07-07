package org.springframework.samples.petclinic.visit;

import java.time.LocalDate;

public interface Visit {

	Integer getId();
	
	LocalDate getDate();

	String getDescription();

	Integer getPetId();
}