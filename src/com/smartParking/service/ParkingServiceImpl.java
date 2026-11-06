package com.smartParking.service;

import com.smartParking.model.Chargeable;
import com.smartParking.model.ParkingSlot;
import com.smartParking.model.ParkingTicket;
import com.smartParking.model.Vehicle;

public class ParkingServiceImpl implements ParkingOperations {

	@Override
	public ParkingTicket createTicket(Vehicle vehicle, ParkingSlot[] slots, int parkingHours, int chargingUnits,
			String ticketId) {

		if (vehicle == null) {
			throw new IllegalArgumentException("Vehicle cannot be null.");
		}

		if (slots == null || slots.length == 0) {
			throw new IllegalArgumentException("Parking slots are not configured.");
		}

		if (parkingHours <= 0) {
			throw new IllegalArgumentException("Parking hours must be greater than zero.");
		}

		if (chargingUnits < 0) {
			throw new IllegalArgumentException("Charging units cannot be negative.");
		}

		if (!(vehicle instanceof Chargeable) && chargingUnits > 0) {
			throw new IllegalArgumentException("Only electric vehicles can use charging units.");
		}

		for (ParkingSlot slot : slots) {

			if (slot != null && !slot.isOccupied()) {

				double parkingFee = vehicle.getHourlyRate() * parkingHours;

				double chargingFee = 0.0;

				if (vehicle instanceof Chargeable) {

					Chargeable chargeableVehicle = (Chargeable) vehicle;

					chargingFee = chargeableVehicle.calculateChargingFee(chargingUnits);
				}

				slot.setOccupied(true);

				return new ParkingTicket(ticketId, vehicle, slot.getSlotId(), parkingHours, chargingUnits, parkingFee,
						chargingFee);
			}
		}

		throw new IllegalStateException("No parking slot is currently available.");
	}

}