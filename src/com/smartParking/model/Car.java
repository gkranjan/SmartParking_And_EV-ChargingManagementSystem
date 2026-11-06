package com.smartParking.model;

public class Car extends Vehicle {

	private static final long serialVersionUID = 1L;

	private String fuelType;

	public Car(String registrationNumber, String ownerName, double hourlyRate, String fuelType) {
		super(registrationNumber, ownerName, hourlyRate);
		this.fuelType = fuelType;

	}

	public String getFuelType() {
		return fuelType;
	}

	@Override
	public String getVehicleType() {
		return "Car(" + fuelType + ")";
	}

}
