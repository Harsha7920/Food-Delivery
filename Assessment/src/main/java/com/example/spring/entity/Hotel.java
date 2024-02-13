package com.example.spring.entity;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.sym.Name;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;

@Entity
@JsonPropertyOrder({ "hotelName", "hotelAddress", "hotelStartTime", "hotelEndTime", "hotelStatus", "createdOn", "createdBy", "updatedOn", "updatedBy" })
public class Hotel {

    @Id
    @NotEmpty(message = "name can not be null")
    @Column(name="hotelName")
    String HotelName;

    @NotEmpty(message = "HotelAddress can not be null")
    String HotelAddress;

    @NotEmpty(message = "HotelStartTime can not be null")
    String HotelStartTime;

    @NotEmpty(message = "HotelEndTime can not be null")
    String HotelEndTime;

    @NotEmpty(message = "HotelStatus can not be null")
    String HotelStatus;

    @NotEmpty(message = "createdOn can not be null")
    String createdOn;

    @NotEmpty(message = "createdBy can not be null")
    String createdBy;

    @NotEmpty(message = "updatedOn can not be null")
    String updatedOn;

    @NotEmpty(message = "updatedBy can not be null")
    String updatedBy;
    

	@OneToMany(mappedBy = "hotel")
    private Set<Delicacy> delicacies = new HashSet<>();


	public String getHotelName() {
		return HotelName;
	}


	public void setHotelName(String hotelName) {
		HotelName = hotelName;
	}


	public String getHotelAddress() {
		return HotelAddress;
	}


	public void setHotelAddress(String hotelAddress) {
		HotelAddress = hotelAddress;
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


	public String getHotelStatus() {
		return HotelStatus;
	}


	public void setHotelStatus(String hotelStatus) {
		HotelStatus = hotelStatus;
	}


	public String getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}


	public String getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}


	public String getUpdatedOn() {
		return updatedOn;
	}


	public void setUpdatedOn(String updatedOn) {
		this.updatedOn = updatedOn;
	}


	public String getUpdatedBy() {
		return updatedBy;
	}


	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}


	public Set<Delicacy> getDelicacies() {
		return delicacies;
	}


	public void setDelicacies(Set<Delicacy> delicacies) {
		this.delicacies = delicacies;
	}


	@Override
	public String toString() {
		return "Hotel [HotelName=" + HotelName + ", HotelAddress=" + HotelAddress + ", HotelStartTime=" + HotelStartTime
				+ ", HotelEndTime=" + HotelEndTime + ", HotelStatus=" + HotelStatus + ", createdOn=" + createdOn
				+ ", createdBy=" + createdBy + ", updatedOn=" + updatedOn + ", updatedBy=" + updatedBy + ", delicacies="
				+ delicacies + "]";
	}


	public Hotel(@NotEmpty(message = "name can not be null") String hotelName,
			@NotEmpty(message = "HotelAddress can not be null") String hotelAddress,
			@NotEmpty(message = "HotelStartTime can not be null") String hotelStartTime,
			@NotEmpty(message = "HotelEndTime can not be null") String hotelEndTime,
			@NotEmpty(message = "HotelStatus can not be null") String hotelStatus,
			@NotEmpty(message = "createdOn can not be null") String createdOn,
			@NotEmpty(message = "createdBy can not be null") String createdBy,
			@NotEmpty(message = "updatedOn can not be null") String updatedOn,
			@NotEmpty(message = "updatedBy can not be null") String updatedBy, Set<Delicacy> delicacies) {
		super();
		HotelName = hotelName;
		HotelAddress = hotelAddress;
		HotelStartTime = hotelStartTime;
		HotelEndTime = hotelEndTime;
		HotelStatus = hotelStatus;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.updatedOn = updatedOn;
		this.updatedBy = updatedBy;
		this.delicacies = delicacies;
	}
	
	 public Hotel(String hotelName) {
	        this.HotelName = hotelName;
	 }


	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
