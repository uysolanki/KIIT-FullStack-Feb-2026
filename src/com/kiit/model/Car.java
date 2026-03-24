package com.kiit.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
	
	private String carModel;
	private String carMfg;
	private double carPrice;
	private String carColor;
	
	
	//dependency
	@Autowired   				    //autowire byType
	@Qualifier("en1")   			//autowire byName
	private Engine engine;
	
	@Autowired   				//autowire byType
	@Qualifier("ge1")  
	private Gear gear;
	
	@Autowired
	private Tyre tyre;			//IoC container
	
	public Car() {}
	public Car(String carModel, String carMfg, double carPrice, String carColor, Engine engine, Gear gear) {
		this.carModel = carModel;
		this.carMfg = carMfg;
		this.carPrice = carPrice;
		this.carColor = carColor;
		this.engine = engine;
		this.gear = gear;
	}
	
	public Car(String carModel, String carMfg, double carPrice, String carColor) {
		this.carModel = carModel;
		this.carMfg = carMfg;
		this.carPrice = carPrice;
		this.carColor = carColor;
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
	
	public void startCar()
	{
		System.out.println("Car Started");
		engine.startEngine();
		tyre.tyreRolling();
	}

}
