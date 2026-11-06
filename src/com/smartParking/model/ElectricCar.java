package com.smartParking.model;

public class ElectricCar extends Vehicle implements Chargeable {

	private static final long serialVersionUID = 1L;

	private double chargeRatePerUnit;

	public ElectricCar(String registrationNumber, String ownerName, double hourlyRate, double chargeRatePerUnit) {
		super(registrationNumber, ownerName, hourlyRate);

		this.chargeRatePerUnit = chargeRatePerUnit;

	}

	@Override
	public double calculateChargingFee(int units) {

		return units * chargeRatePerUnit;
	}

	@Override
	public String getVehicleType() {

		return "Electric Car";
	}

}
