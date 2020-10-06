package com.example.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.example.model.Parking;


@Repository
public class ParkingDao {

	
    public HashMap<Integer,Parking> parkingMap;
	
	final int MAX_CAPACITY=60;
	
	public HashMap<Integer,Parking> createParking(Parking parking){
		parkingMap.put(parking.getParkingId(), parking);
		return this.parkingMap;
	}
	
	public Parking getParking(int slotId){
		return this.parkingMap.get(slotId);
	}
	
	public HashMap<Integer,Parking> removeParking(int slotId){
		this.parkingMap.remove(slotId);
		return this.parkingMap;
	}
}
