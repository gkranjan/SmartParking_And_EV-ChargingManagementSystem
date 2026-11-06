package com.smartParking.model;

public class ParkingSlot {

	private String slotId;
	private boolean occupied;
	public ParkingSlot(String slotId) {
		super();
		this.slotId = slotId;
		this.occupied = occupied;
	}
	public boolean isOccupied() {
		return occupied;
	}
	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}
	public String getSlotId() {
		return slotId;
	}
	
	
}
