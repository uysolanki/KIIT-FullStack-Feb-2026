package com.kiit.model;

public class Car {
	
	private String carModel;
	private String carMfg;
	private double carPrice;
	private String carColor;
	
	private Engine engine;
	private Gear gear;
	
	public Car() {}
	public Car(String carModel, String carMfg, double carPrice, String carColor, Engine engine, Gear gear) {
		this.carModel = carModel;
		this.carMfg = carMfg;
		this.carPrice = carPrice;
		this.carColor = carColor;
		this.engine = engine;
		this.gear = gear;
	}
	public String getCarModel() {
		return carModel;
	}
	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}
	public String getCarMfg() {
		return carMfg;
	}
	public void setCarMfg(String carMfg) {
		this.carMfg = carMfg;
	}
	public double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(double carPrice) {
		this.carPrice = carPrice;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Gear getGear() {
		return gear;
	}
	public void setGear(Gear gear) {
		this.gear = gear;
	}
	
	@Override
	public String toString() {
		return "Car [carModel=" + carModel + ", carMfg=" + carMfg + ", carPrice=" + carPrice + ", carColor=" + carColor
				+ ", engine=" + engine + ", gear=" + gear + "]";
	}
	
	

}
