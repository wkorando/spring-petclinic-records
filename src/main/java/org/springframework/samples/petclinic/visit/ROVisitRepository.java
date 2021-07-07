package org.springframework.samples.petclinic.visit;

import java.util.List;

public interface ROVisitRepository {
	List<Visit> findByPetId(Integer petId);
}
