package com.example.service;

import com.example.model.Bike;
import com.example.model.Bus;
import com.example.model.Car;
import com.example.model.Vehicle;

public class VehicleFactory {
	
	
	public static Vehicle getVehicle(String type,Vehicle vehicle) {
		
		
		if("car".equals(type)) {
			Car car = new Car(vehicle.getRegistrationId(), vehicle.getUserName());
			return car;
			
		}else if("bike".equals(type)) {
			Bike bike = new Bike(vehicle.getRegistrationId(), vehicle.getUserName());
			return bike;
			
		}else if("bus".equals(type)){
			Bus bus = new Bus(vehicle.getRegistrationId(), vehicle.getUserName());
			return bus;
			
		}
		return null;
	}

}
