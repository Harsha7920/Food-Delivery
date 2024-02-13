package com.example.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.spring.entity.Delicacy;
import com.example.spring.repository.DelicacyRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class DelicacyServiceImpl implements DelicacyService {
	
	DelicacyRepository Delicacyrepo;
	
	@Autowired
	public DelicacyServiceImpl(DelicacyRepository delicacyrepo) {
		super();
		Delicacyrepo = delicacyrepo;
	}

	@Override
	public String addDelicacy(Delicacy delicacy) {
		Delicacyrepo.save(delicacy);
		return "Delicacy is created";
	}
	
	@Override
	public Delicacy getDelicacy(String delicacyName) {
		Delicacy d = Delicacyrepo.findById(delicacyName).get();
		return d;
	}
	
	@Override
    public String updateDelicacy(Delicacy updatedDelicacy) {
        Delicacy existingDelicacy = Delicacyrepo.findById(updatedDelicacy.getDelicacyName()).orElse(null);

        if (existingDelicacy != null) {
            
            existingDelicacy.setStartTime(updatedDelicacy.getStartTime());
            existingDelicacy.setEndTime(updatedDelicacy.getEndTime());
            existingDelicacy.setStatus(updatedDelicacy.getStatus());
            existingDelicacy.setCost(updatedDelicacy.getCost());
            existingDelicacy.setUpdatedOn(updatedDelicacy.getUpdatedOn());
            existingDelicacy.setUpdatedBy(updatedDelicacy.getUpdatedBy());

            Delicacyrepo.save(existingDelicacy);
            return "Delicacy is updated";
        } else {
            return "Delicacy with name " + updatedDelicacy.getDelicacyName() + " not found.";
        }
    }

	@Override
	public String deleteDelicacy(String DelicacyName) {
		Delicacyrepo.deleteById(DelicacyName);
		return "Delicacy is deleted";
	}

	

}
