package com.example.dao;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

@Repository
public class SlotDao {
	
	public static HashMap<Integer,Boolean> slotsMap=new HashMap<>();
	
	public HashMap<Integer,Boolean> updateSlots(int slotId, boolean isAvailable){
		this.slotsMap.put(slotId,isAvailable);
		return slotsMap;
	}
	
	public HashMap<Integer,Boolean> removeSlots(int slotId){
		this.slotsMap.remove(slotId);
		return slotsMap;
	}

	public boolean getSlots(int slotId){
		return this.slotsMap.get(slotId);
	}

	

}
