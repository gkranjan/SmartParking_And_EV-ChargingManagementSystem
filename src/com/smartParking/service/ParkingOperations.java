package com.smartParking.service;

import com.smartParking.model.ParkingSlot;
import com.smartParking.model.ParkingTicket;
import com.smartParking.model.Vehicle;

public interface ParkingOperations {

	ParkingTicket createTicket(Vehicle vehicle,ParkingSlot[] slots,int parkingHours,int chargingUnits,String ticketId);
}
