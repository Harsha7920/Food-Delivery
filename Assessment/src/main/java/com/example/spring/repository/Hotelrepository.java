package com.example.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entity.Hotel;

public interface Hotelrepository extends JpaRepository<Hotel,String>
{

}
