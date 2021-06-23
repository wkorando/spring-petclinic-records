package org.springframework.samples.petclinic.vet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VetsService {
	
	private final VetRepository vetRepo;
	
	public VetsService(VetRepository vets) {
		this.vetRepo = vets;
	}
	
	
	public List<VetDto> findAll(){
		Collection<Vet> vets = vetRepo.findAll();
		List<VetDto> vetRecords = new ArrayList<>();
		for(Vet vet : vets) {
			vetRecords.add(new VetDto(vet.getId(), vet.getFirstName(), vet.getLastName(), vet.getSpecialties()));
		}
		
		return vetRecords;
	}
 }
