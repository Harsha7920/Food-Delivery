package com.example.spring.service;

import java.util.List;

import com.example.spring.entity.Hotel;
import com.example.spring.entity.HotelSearchCriteria;

public interface HotelService {
	
	String createHotel(Hotel h);
	List<Hotel> searchHotels(HotelSearchCriteria searchCriteria);
   List<Hotel> getAllHotelInfo();
    String updateHotel(Hotel h);
    String deleteHotel(String HotelName);
}
