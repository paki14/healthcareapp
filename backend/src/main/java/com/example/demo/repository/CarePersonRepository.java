package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CarePerson;

public interface CarePersonRepository extends JpaRepository<CarePerson, Integer> {
	List<CarePerson> findCarePatientByCareId(Integer id);

	List<CarePerson> findCarePatientByPatientId(Integer id);

}
