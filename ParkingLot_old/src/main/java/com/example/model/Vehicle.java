package com.example.model;

public  class Vehicle {
	
	
	private String registrationId;
	
	private String userName;
	
    private int slotsReq;	
    
    private String vehicleTyp;


	public String getRegistrationId() {
		return registrationId;
	}

	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getSlotsReq() {
		return slotsReq;
	}



	public void setSlotsReq(int slotsReq) {
		this.slotsReq = slotsReq;
	}

	public Vehicle(String registrationId, String userName) {
		super();
		this.registrationId = registrationId;
		this.userName = userName;
	}

	public String getVehicleTyp() {
		return vehicleTyp;
	}

	public void setVehicleTyp(String vehicleTyp) {
		this.vehicleTyp = vehicleTyp;
	}

	
	
	

}
