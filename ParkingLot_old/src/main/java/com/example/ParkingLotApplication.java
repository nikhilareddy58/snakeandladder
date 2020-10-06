package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.dao.SlotDao;
import com.example.service.SlotService;

@SpringBootApplication
public class ParkingLotApplication {
	
	@Autowired
	SlotService slotService;

	public static void main(String[] args) {
		SpringApplication.run(ParkingLotApplication.class, args);
	}

}
