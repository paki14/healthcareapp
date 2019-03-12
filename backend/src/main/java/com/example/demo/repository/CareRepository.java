package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Care;

public interface CareRepository extends JpaRepository<Care, Integer>{


}
