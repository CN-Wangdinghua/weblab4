package wangdinghua17204222.service;

import java.util.Collection;
import java.util.Optional;

import wangdinghua17204222.model.Owner;
import wangdinghua17204222.model.Specialty;
import wangdinghua17204222.model.Vet;

public interface ClinicService {

	public Collection<Vet> getAllVets();
	public Collection<Owner> getAllOwners();
	public Collection<Owner> findOwnersByLastName(String lastName);
	public Collection<Specialty> getAllSpecialties();
	public Owner addOwner(Owner owner);
	Optional<Specialty> findSpecialtyById(int id);
}
