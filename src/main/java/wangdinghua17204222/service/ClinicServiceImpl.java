package wangdinghua17204222.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wangdinghua17204222.model.Owner;
import wangdinghua17204222.model.Specialty;
import wangdinghua17204222.model.Vet;
import wangdinghua17204222.repository.OwnerRepository;
import wangdinghua17204222.repository.SpecialtyRepository;
import wangdinghua17204222.repository.VetRepository;

@Service
public class ClinicServiceImpl implements ClinicService {

	private VetRepository vetRepo;
	private OwnerRepository ownerRepo;
	private SpecialtyRepository specialtyRepo;
	
	@Autowired
	public ClinicServiceImpl(
			VetRepository vetRepo,
			OwnerRepository ownerRepo, SpecialtyRepository specialtyRepo) {
		this.vetRepo = vetRepo;
		this.ownerRepo = ownerRepo;
		this.specialtyRepo = specialtyRepo;
	}

	@Override
	public Collection<Vet> getAllVets() {
		Collection<Vet> vets = new ArrayList<Vet>();
		vetRepo.findAll().forEach(vet->{
			vets.add(vet);
		});
		return vets;
	}

	@Override
	public Collection<Owner> getAllOwners() {
		return (Collection<Owner>) ownerRepo.findAll();
	}

	@Override
	public Collection<Owner> findOwnersByLastName(String lastName) {
		Collection<Owner> owners = ownerRepo.findByLastName("%"+lastName+"%");
		return owners;
	}

	@Override
	public Owner addOwner(Owner owner) {
		return ownerRepo.save(owner);
	}

	@Override
	public Collection<Specialty> getAllSpecialties() {
		return (Collection<Specialty>) specialtyRepo.findAll();
	}

	@Override
	public Optional<Specialty> findSpecialtyById(int id) {
		return specialtyRepo.findById(id);
	}
}
