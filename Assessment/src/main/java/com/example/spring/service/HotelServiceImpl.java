package com.example.spring.service;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.entity.Hotel;
import com.example.spring.entity.HotelSearchCriteria;
import com.example.spring.repository.Hotelrepository;


import jakarta.transaction.Transactional;

import java.util.stream.Collectors;

@Service
@Transactional
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	Hotelrepository hotelrepo;

	public HotelServiceImpl(Hotelrepository hotelrepo) {
		super();
		this.hotelrepo = hotelrepo;
	}

	@Override
	public String createHotel(Hotel h) {
		hotelrepo.save(h);
		return "Hotel is created";
		
	}
	
	
	@Override
	public List<Hotel> searchHotels(HotelSearchCriteria searchCriteria) {
	    return hotelrepo.findAll().stream()
	            .filter(hotel -> (searchCriteria.getHotelStatus() == null || hotel.getHotelStatus().equalsIgnoreCase(searchCriteria.getHotelStatus()))
	                    && (searchCriteria.getHotelName() == null || hotel.getHotelName().toLowerCase().contains(searchCriteria.getHotelName().toLowerCase()))
	                    && (searchCriteria.getHotelStartTime() == null || hotel.getHotelStartTime().compareTo(searchCriteria.getHotelStartTime()) >= 0)
	                    && (searchCriteria.getHotelEndTime() == null || hotel.getHotelEndTime().compareTo(searchCriteria.getHotelEndTime()) <= 0)
	                    && (searchCriteria.getDelicacyName() == null || hotel.getDelicacies().stream().anyMatch(delicacy -> delicacy.getDelicacyName().equalsIgnoreCase(searchCriteria.getDelicacyName()))))
	            .collect(Collectors.toList());
	}


	@Override
	public List<Hotel> getAllHotelInfo() {
	    List<Hotel> hotellist = hotelrepo.findAll();
	    return hotellist;
	}


	@Override
	public String updateHotel(Hotel updatedHotel) {
	    Hotel existingHotel = hotelrepo.findById(updatedHotel.getHotelName()).orElse(null);

	    if (existingHotel != null) {
	        existingHotel.setHotelAddress(updatedHotel.getHotelAddress());
	        existingHotel.setHotelStartTime(updatedHotel.getHotelStartTime());
	        existingHotel.setHotelEndTime(updatedHotel.getHotelEndTime());
	        existingHotel.setHotelStatus(updatedHotel.getHotelStatus());
	        existingHotel.setUpdatedOn(updatedHotel.getUpdatedOn());
	        existingHotel.setUpdatedBy(updatedHotel.getUpdatedBy());

	        hotelrepo.save(existingHotel);
	        return "Hotel is updated";
	    } else {
	        return "Hotel with name " + updatedHotel.getHotelName() + " not found.";
	    }
	}



	@Override
	public String deleteHotel(String HotelName) {
		hotelrepo.deleteById(HotelName);
		return "Hotel is deleted";
	}

	
	
	

}
