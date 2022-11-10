package com.marketingapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingapp.entities.Lead;
import com.marketingapp.repositories.LeadRepository;
@Service
public class LeadServiceImpl implements LeadService {
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveOnecreatelead(Lead lead) {
		leadRepo.save(lead);
	}
	@Override
	public List<Lead> readall() {
		List<Lead> lead = leadRepo.findAll();
		return lead;
		
	}
	@Override
	public void deleteById(long id) {
		leadRepo.deleteById(id);		
	}
	@Override
	public Lead findById(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
		
		
	}

}
