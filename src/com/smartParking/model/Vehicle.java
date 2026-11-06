package com.smartParking.model;

import java.io.Serializable;

public abstract class Vehicle implements Serializable {

	private static final long serialVersionUID = 1L;

	private String registrationNumber;
	private String ownerName;
	private double hourlyRate;

	public Vehicle(String registrationNumber, String ownerName, double hourlyRate) {
		super();
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.hourlyRate = hourlyRate;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public abstract String getVehicleType();

	public void displayDetails() {

		System.out.println("Type: " + getVehicleType() + " | Registration: " + registrationNumber + " | Owner: "
				+ ownerName + " | Hourly Rate: Rs. " + hourlyRate);
	}

}
