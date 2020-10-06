package com.example.model;

public class Car extends Vehicle{
	
	
	public Car(String registrationId, String userName) {
		super(registrationId, userName);
		super.setSlotsReq(4);
		super.setVehicleTyp("car");

	}

	
	
}
