package com.smartParking.model;

import java.io.Serializable;

public class ParkingTicket implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	private String ticketId;
	private Vehicle vehicle;
	private String slotId;
	private int parkingHours;
	private int chargingUnits;
	private double parkingFee;
	private double chargingFee;

	public ParkingTicket(String ticketId, Vehicle vehicle, String slotId, int parkingHours, int chargingUnits,
			double parkingFee, double chargingFee) {
		super();
		this.ticketId = ticketId;
		this.vehicle = vehicle;
		this.slotId = slotId;
		this.parkingHours = parkingHours;
		this.chargingUnits = chargingUnits;
		this.parkingFee = parkingFee;
		this.chargingFee = chargingFee;
	}

	public Vehicle getVehicle() {
		return vehicle;

	}

	public ParkingTicket clone() throws CloneNotSupportedException {
		return (ParkingTicket) super.clone();
	}

	public String createReceipt() {
		StringBuilder receipt = new StringBuilder();
		receipt.append("========== PARKING RECEIPT ==========\n");

		receipt.append("Ticket ID       : ").append(ticketId).append('\n');
		receipt.append("Vehicle         : ").append(vehicle.getRegistrationNumber()).append('\n');

		receipt.append("Vehicle Type    : ").append(vehicle.getVehicleType()).append('\n');

		receipt.append("Parking Slot    : ").append(slotId).append('\n');

		receipt.append("Parking Hours   : ").append(parkingHours).append('\n');

		receipt.append("Charging Units  : ").append(chargingUnits).append('\n');

		receipt.append("Parking Fee     : Rs.").append(parkingFee).append('\n');

		receipt.append("Charging Fee    : Rs.").append(chargingFee).append('\n');

		receipt.append("Total Amount    : Rs.").append(parkingFee + chargingFee).append('\n');

		receipt.append("=====================================");

		return receipt.toString();
	}

	public String getTicketId() {
		return null;
	}

}
