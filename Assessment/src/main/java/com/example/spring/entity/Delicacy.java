package com.example.spring.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotEmpty;

@Entity
@JsonPropertyOrder({ "delicacyName", "cost", "startTime", "endTime", "status", "createdOn", "createdBy", "updatedOn", "updatedBy", "hotel" })
public class Delicacy {
	
	@Id
	@NotEmpty(message = "name can not be null")
	String DelicacyName;
	@NotEmpty(message = "startTime can not be null")
	String startTime; 
	@NotEmpty(message = "EndTime can not be null")
	String EndTime; 
	@NotEmpty(message = "Status can not be null")
	String Status;
	@NotEmpty(message = "Cost can not be null")
	String Cost;
	@NotEmpty(message = "createdOn can not be null")
	String createdOn;
	@NotEmpty(message = "createdBy can not be null")
	String createdBy;
	@NotEmpty(message = "updatedOn can not be null")
	String updatedOn;
	@NotEmpty(message = "updatedBy can not be null")
	String updatedBy;
	
	 @ManyToOne
	 @JoinColumn(name = "hotelName")
	 @JsonBackReference
	 private Hotel hotel;

	public String getDelicacyName() {
		return DelicacyName;
	}

	public void setDelicacyName(String delicacyName) {
		DelicacyName = delicacyName;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return EndTime;
	}

	public void setEndTime(String endTime) {
		EndTime = endTime;
	}

	public Delicacy() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Delicacy(@NotEmpty(message = "name can not be null") String delicacyName,
			@NotEmpty(message = "startTime can not be null") String startTime,
			@NotEmpty(message = "EndTime can not be null") String endTime,
			@NotEmpty(message = "Status can not be null") String status,
			@NotEmpty(message = "Cost can not be null") String cost,
			@NotEmpty(message = "createdOn can not be null") String createdOn,
			@NotEmpty(message = "createdBy can not be null") String createdBy,
			@NotEmpty(message = "updatedOn can not be null") String updatedOn,
			@NotEmpty(message = "updatedBy can not be null") String updatedBy, Hotel hotel) {
		super();
		DelicacyName = delicacyName;
		this.startTime = startTime;
		EndTime = endTime;
		Status = status;
		Cost = cost;
		this.createdOn = createdOn;
		this.createdBy = createdBy;
		this.updatedOn = updatedOn;
		this.updatedBy = updatedBy;
		this.hotel = hotel;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getCost() {
		return Cost;
	}

	public void setCost(String cost) {
		Cost = cost;
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

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Delicacy [DelicacyName=" + DelicacyName + ", startTime=" + startTime + ", EndTime=" + EndTime
				+ ", Status=" + Status + ", Cost=" + Cost + ", createdOn=" + createdOn + ", createdBy=" + createdBy
				+ ", updatedOn=" + updatedOn + ", updatedBy=" + updatedBy + ", hotel=" + hotel + "]";
	}
	
	
	
	
	
}