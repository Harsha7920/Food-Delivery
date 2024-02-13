package com.example.spring.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.entity.Delicacy;
import com.example.spring.service.DelicacyService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("Delicacy")
@Validated
public class DelicacyController {
	
	DelicacyService delserv;

	public DelicacyController(DelicacyService delserv) {
		super();
		this.delserv = delserv;
	}
	
	@PostMapping
	public String addDelicacy(@Valid @RequestBody Delicacy delicacy) {
		String msg = delserv.addDelicacy(delicacy);
		return msg;
		}
	
	@GetMapping(value="{DelicacyName}")
	public Delicacy getDelicacy(@PathVariable String DelicacyName) {
	    Delicacy msg = delserv.getDelicacy(DelicacyName);
	    return msg;
	}
		
	
	@PutMapping
	public String updateDelicacy(@Valid @RequestBody Delicacy updatedDelicacy) {
		String msg = delserv.updateDelicacy(updatedDelicacy);
		return msg;
	}
	
	@DeleteMapping(value="{DelicacyName}")
	public String deleteDelicacy(@PathVariable String DelicacyName) {
		String msg = delserv.deleteDelicacy(DelicacyName);
		return msg;
	}

}
