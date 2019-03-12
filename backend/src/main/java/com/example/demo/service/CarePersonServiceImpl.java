package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CarePerson;
import com.example.demo.repository.CarePersonRepository;
import com.example.demo.repository.CareRepository;

@Service
public class CarePersonServiceImpl implements CarePersonService {
	@Autowired
	private CarePersonRepository carePersonRepository;
	@Autowired
	private CareRepository careRepository;

	public List<CarePerson> getCarePersionById(Integer id) {

		return carePersonRepository.findCarePatientByCareId(id);
	}

	@Override
	public List<CarePerson> getAllCarePersion() {
		return carePersonRepository.findAll();
	}

	public List<CarePerson> getCarePersionByPatientId(Integer id) {
		return carePersonRepository.findCarePatientByPatientId(id);
	}

}
