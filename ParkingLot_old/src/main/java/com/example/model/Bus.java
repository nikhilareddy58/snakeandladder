package com.example.model;

public class Bus extends Vehicle{
	
	public Bus(String registrationId, String userName) {
		super(registrationId, userName);
		super.setSlotsReq(6);
		super.setVehicleTyp("bus");

	}
	
}
