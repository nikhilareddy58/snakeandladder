package com.example.model;

public class Slot {
	
	
	private int slotId;
	
	private boolean isSlotFree;

	public int getSlotId() {
		return slotId;
	}

	public void setSlotId(int slotId) {
		this.slotId = slotId;
	}

	public boolean isSlotFree() {
		return isSlotFree;
	}

	public Slot(int slotId, boolean isSlotFree) {
		super();
		this.slotId = slotId;
		this.isSlotFree = isSlotFree;
	}

	public void setSlotFree(boolean isSlotFree) {
		this.isSlotFree = isSlotFree;
	}
	
	

}
