package com.marketingapp.services;

import java.util.List;

import com.marketingapp.entities.Lead;

public interface LeadService {
	public void saveOnecreatelead(Lead lead);
	public List<Lead> readall();
	public void deleteById(long id);
	public Lead findById(long id);
}
