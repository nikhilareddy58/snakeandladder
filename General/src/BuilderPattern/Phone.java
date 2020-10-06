package BuilderPattern;

public class Phone {
	
	private String os;
	private int ram;
	private int battery;
	
	public Phone(String os, int ram, int battery) {
		this.os = os;
		this.ram = ram;
		this.battery = battery;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getBattery() {
		return battery;
	}
	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	

}
