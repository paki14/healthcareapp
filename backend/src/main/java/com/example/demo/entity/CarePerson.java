package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "care_person", schema = "websocket")
public class CarePerson implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5935951170464024992L;
	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "care_id")
	private Care care;
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private Patient patient;

//	public Hello(Object )

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Care getCare() {
		return care;
	}

	public void setCare(Care care) {
		this.care = care;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

}
