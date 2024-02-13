package com.example.spring.service;



import com.example.spring.entity.Delicacy;

public interface DelicacyService {

	String addDelicacy(Delicacy delicacy);
	Delicacy getDelicacy(String delicacyName);
    String updateDelicacy(Delicacy delicacy);
    String deleteDelicacy(String delicacyName);
}
