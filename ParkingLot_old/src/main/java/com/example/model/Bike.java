package com.example.model;

public class Bike extends Vehicle{

	public Bike(String registrationId, String userName) {
		super(registrationId, userName);
		super.setSlotsReq(2);
		super.setVehicleTyp("bike");
	}

	
	
}
