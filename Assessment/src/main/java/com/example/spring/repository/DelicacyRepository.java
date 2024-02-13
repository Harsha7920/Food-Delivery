package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Delicacy;

public interface DelicacyRepository extends JpaRepository<Delicacy,String> {

}
