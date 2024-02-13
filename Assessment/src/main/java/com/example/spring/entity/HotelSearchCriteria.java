package com.example.spring.entity;

public class HotelSearchCriteria {
	
	String HotelName;
	String HotelStatus;
	String HotelStartTime;
	String HotelEndTime;
	String DelicacyName;
	public HotelSearchCriteria() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HotelSearchCriteria(String hotelName, String hotelStatus, String hotelStartTime, String hotelEndTime,
			String delicacyName) {
		super();
		HotelName = hotelName;
		HotelStatus = hotelStatus;
		HotelStartTime = hotelStartTime;
		HotelEndTime = hotelEndTime;
		DelicacyName = delicacyName;
	}
	@Override
	public String toString() {
		return "HotelSearchCriteria [HotelName=" + HotelName + ", HotelStatus=" + HotelStatus + ", HotelStartTime="
				+ HotelStartTime + ", HotelEndTime=" + HotelEndTime + ", DelicacyName=" + DelicacyName + "]";
	}
	public String getHotelName() {
		return HotelName;
	}
	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}
	public String getHotelStatus() {
		return HotelStatus;
	}
	public void setHotelStatus(String hotelStatus) {
		HotelStatus = hotelStatus;
	}
	public String getHotelStartTime() {
		return HotelStartTime;
	}
	public void setHotelStartTime(String hotelStartTime) {
		HotelStartTime = hotelStartTime;
	}
	public String getHotelEndTime() {
		return HotelEndTime;
	}
	public void setHotelEndTime(String hotelEndTime) {
		HotelEndTime = hotelEndTime;
	}
	public String getDelicacyName() {
		return DelicacyName;
	}
	public void setDelicacyName(String delicacyName) {
		DelicacyName = delicacyName;
	}
}