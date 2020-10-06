package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.dao.SlotDao;
import com.example.exception.NoSlotException;

@Service
public class SlotService {

	@Autowired
	SlotDao slotDao;

	final static int MAX_CAPACITY = 60;
	
	
	public static void intitializeSlots() {
		for (int i = 1; i < MAX_CAPACITY; i++) {
			SlotDao.slotsMap.put(i, true);
		}
	}

	public int getSlots(int capacity) throws Exception{
		int i=0;
		while(i<MAX_CAPACITY) {
			int count=0;
			while(count<capacity) {
				if(slotDao.getSlots(i)) {
					count++;
				}else {
					break;
				}
				if(count==capacity) {
					for(int j=i;j>=i-count;j--) {
						slotDao.updateSlots(j, false);
					}
					return i-count;
				}
			}
		}
		throw new NoSlotException();
	}
	
	public void updateSlot(int slotId, boolean isAvailable) {
		slotDao.updateSlots(slotId, isAvailable);
	}

}
