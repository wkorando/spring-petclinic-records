package org.springframework.samples.petclinic.owner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

@Service
public class OwnerService {

	private OwnerRepository ownerRepo;

	public OwnerService(OwnerRepository ownerRepo) {
		this.ownerRepo = ownerRepo;
	}

	public void save(@Valid Owner owner) {

//		Owner owner = new Owner();
//		owner.setAddress(ownerDto.address());
//		owner.setCity(ownerDto.city());
//		owner.setFirstName(ownerDto.firstName());
//		owner.setLastName(ownerDto.lastName());
//		owner.setTelephone(ownerDto.telephone());
//		owner.setPetsInternal(ownerDto.pets());
		ownerRepo.save(owner);
	}

	public Collection<OwnerDto> findByLastName(String lastName) {
		Collection<Owner> owners = ownerRepo.findByLastName(lastName);
		List<OwnerDto> ownerDtos = new ArrayList<OwnerDto>();

		for (Owner o : owners) {
			ownerDtos.add(new OwnerDto(o.getId(), o.getAddress(), o.getCity(), o.getTelephone(), o.getPetsInternal(),
					o.getFirstName(), o.getLastName()));
		}
		return ownerDtos;
	}

	public OwnerDto findById(int ownerId) {
		Owner owner = ownerRepo.findById(ownerId);
		OwnerDto ownerDto = new OwnerDto(owner.getId(), owner.getAddress(), owner.getCity(), owner.getTelephone(), owner.getPetsInternal(),
				owner.getFirstName(), owner.getLastName());
		return ownerDto;
	}

	public Owner updateOwner(Owner owner) {
//		Owner owner = new Owner();
//		owner.setAddress(ownerDto.address());
//		owner.setCity(ownerDto.city());
//		owner.setFirstName(ownerDto.firstName());
//		owner.setLastName(ownerDto.lastName());
//		owner.setTelephone(ownerDto.telephone());
//		owner.setPetsInternal(ownerDto.pets());
//		owner.setId(ownerDto.id());
		ownerRepo.save(owner);
		return owner;
	}
}
