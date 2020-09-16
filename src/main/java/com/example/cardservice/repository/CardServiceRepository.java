package com.example.cardservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cardservice.model.Card;

public interface CardServiceRepository extends JpaRepository<Card, Long>{

}
