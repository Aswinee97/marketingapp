package com.marketingapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingapp.entities.Lead;
import com.marketingapp.services.LeadService;
import com.marketingapp.util.EmailService;

@Controller
public class LeadController {
	
	@Autowired
	private EmailService emailServ;
	
	@Autowired
	private LeadService leadServ;
//	http://localhost:8080/marketingapp/viewleadpage
	@RequestMapping("/viewleadpage")
	public String viewleadpage() {
		return "create_lead";
	}

	@RequestMapping("/savelead")
	public String saveCreateleadpage(@ModelAttribute("Lead")Lead lead) {
		leadServ.saveOnecreatelead(lead);
		emailServ.sendSimpleMail(lead.getEmail(), "Check", "Hiii!! I am Aswinee Kumar Behera");
		return "create_lead";
	}
//	http://localhost:8080/marketingapp/readlead
	@RequestMapping("/readlead")
	public String readAll(Model model) {
		List<Lead> leads = leadServ.readall();
		model.addAttribute("lead", leads);
		return "read_lead";
	}
	@RequestMapping("/deletelead")
	public String deletelead(@RequestParam("id")long id,Model model) {
		leadServ.deleteById(id);
		List<Lead> leads = leadServ.readall();
		model.addAttribute("lead", leads);
		return "read_lead";
	}
	@RequestMapping("/updatelead")
	public String updatelead(@RequestParam("id")long id,Model model) {
		Lead lead = leadServ.findById(id);
		model.addAttribute("lead", lead);
		return "update_lead";
	}
	@RequestMapping("/updatepage")
	public String updateleadpage(@ModelAttribute("Lead")Lead lead,Model model) {
		leadServ.saveOnecreatelead(lead);
		List<Lead> leads = leadServ.readall();
		model.addAttribute("lead", leads);
		return "read_lead";
	}
	
	

}
