package com.kiit.model;

public class Gear {

	private int gearLever;
	private String gearMfg;
	private String gearType;
	
	public Gear() {}
	public Gear(int gearLever, String gearMfg, String gearType) {
		this.gearLever = gearLever;
		this.gearMfg = gearMfg;
		this.gearType = gearType;
	}
	public int getGearLever() {
		return gearLever;
	}
	public void setGearLever(int gearLever) {
		this.gearLever = gearLever;
	}
	public String getGearMfg() {
		return gearMfg;
	}
	public void setGearMfg(String gearMfg) {
		this.gearMfg = gearMfg;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	@Override
	public String toString() {
		return "Gear [gearLever=" + gearLever + ", gearMfg=" + gearMfg + ", gearType=" + gearType + "]";
	}
	
	
}
