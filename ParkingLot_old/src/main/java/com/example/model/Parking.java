package com.example.model;

public class Parking {
	
	private Vehicle parkedVehicle;
	
	private int allocatedSlot;
	
	private int parkingId;
	
	private String parkingStatus;

	public Vehicle getParkedVehicle() {
		return parkedVehicle;
	}

	public void setParkedVehicle(Vehicle parkedVehicle) {
		this.parkedVehicle = parkedVehicle;
	}

	public int getAllocatedSlot() {
		return allocatedSlot;
	}

	public void setAllocatedSlot(int allocatedSlot) {
		this.allocatedSlot = allocatedSlot;
	}

	public int getParkingId() {
		return parkingId;
	}

	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}

	public String getParkingStatus() {
		return parkingStatus;
	}

	public void setParkingStatus(String parkingStatus) {
		this.parkingStatus = parkingStatus;
	}
	
	

}
