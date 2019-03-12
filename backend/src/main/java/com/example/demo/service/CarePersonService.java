package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CarePerson;

public interface CarePersonService {

	List<CarePerson> getCarePersionById(Integer id);

	List<CarePerson> getAllCarePersion();

	List<CarePerson> getCarePersionByPatientId(Integer id);
}
