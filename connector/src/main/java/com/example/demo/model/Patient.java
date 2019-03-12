package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Patient {

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + ", temperature=" + temperature + ", pulse=" + pulse
				+ ", hartRates=" + hartRates + "]";
	}

	private Integer id;
	private String name;
	private double temperature;
	private double pulse;
	private double hartRates;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	public double getPulse() {
		return pulse;
	}

	public void setPulse(double pulse) {
		this.pulse = pulse;
	}

	public double getHartRates() {
		return hartRates;
	}

	public void setHartRates(double hartRates) {
		this.hartRates = hartRates;
	}

}
