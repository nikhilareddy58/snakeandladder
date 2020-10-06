package com.example.model;

public class ParkingLot {
	
	
	private String parkingLotName;
	
	private int parkingLotId;

	public String getParkingLotName() {
		return parkingLotName;
	}

	public void setParkingLotName(String parkingLotName) {
		this.parkingLotName = parkingLotName;
	}

	public int getParkingLotId() {
		return parkingLotId;
	}

	public void setParkingLotId(int parkingLotId) {
		this.parkingLotId = parkingLotId;
	}

	public ParkingLot(String parkingLotName, int parkingLotId) {
		super();
		this.parkingLotName = parkingLotName;
		this.parkingLotId = parkingLotId;
	}

	


}
