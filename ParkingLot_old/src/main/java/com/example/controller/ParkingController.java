package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Parking;
import com.example.model.Vehicle;
import com.example.service.ParkingService;

@RestController
public class ParkingController {
	
	@Autowired
	ParkingService parkingService;
	
	@RequestMapping(value="/createParking",method=RequestMethod.POST)
	public Parking createParking(@RequestBody Vehicle vehicle) throws Exception {
		return parkingService.createParking(vehicle,vehicle.getVehicleTyp());
	}
	
	@RequestMapping(value="/updateParking",method=RequestMethod.POST)
	public Parking updateParking(@RequestBody Vehicle vehicle) throws Exception {
		return parkingService.createParking(vehicle,vehicle.getVehicleTyp());
	}
	
}
