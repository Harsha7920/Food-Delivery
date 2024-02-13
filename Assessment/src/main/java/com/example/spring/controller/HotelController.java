package com.example.spring.controller;

import java.util.List;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.spring.entity.Hotel;
import com.example.spring.entity.HotelSearchCriteria;
import com.example.spring.service.HotelService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("hotel")
@Validated
public class HotelController {
	
	HotelService Hotelserv;

	public HotelController(HotelService hotelserv) {
		super();
		Hotelserv = hotelserv;
	}
	
	@PostMapping
	public String createHotel(@Valid @RequestBody Hotel h) {
		
		String msg = Hotelserv.createHotel(h);
		return msg;
	}
	
	@PostMapping("/searchHotels")
    public List<Hotel> searchHotels(@Valid @RequestBody HotelSearchCriteria searchCriteria) {
        return Hotelserv.searchHotels(searchCriteria);
    }
	
	@GetMapping
	public List<Hotel> getAllHotelInfo(){
		List<Hotel> hall = Hotelserv.getAllHotelInfo();
		return hall;
		}
	
	@PutMapping
	public String updateHotel(@Valid @RequestBody Hotel updatedHotel) {
	    String msg = Hotelserv.updateHotel(updatedHotel);
	    return msg;
	}

	
	@DeleteMapping("{HotelName}")
	public String deleteHotel(@PathVariable String HotelName) {
		String msg = Hotelserv.deleteHotel(HotelName);
		return msg;
	}
}
