package com.kiit.model;

public class Engine {

	private int engineCC;
	private int engineLiter;
	private String engineType;
	private String engineMfg;
	
	public Engine() {}
	public Engine(int engineCC, int engineLiter, String engineType, String engineMfg) {
		this.engineCC = engineCC;
		this.engineLiter = engineLiter;
		this.engineType = engineType;
		this.engineMfg = engineMfg;
	}
	public int getEngineCC() {
		return engineCC;
	}
	public void setEngineCC(int engineCC) {
		this.engineCC = engineCC;
	}
	public int getEngineLiter() {
		return engineLiter;
	}
	public void setEngineLiter(int engineLiter) {
		this.engineLiter = engineLiter;
	}
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public String getEngineMfg() {
		return engineMfg;
	}
	public void setEngineMfg(String engineMfg) {
		this.engineMfg = engineMfg;
	}
	@Override
	public String toString() {
		return "Engine [engineCC=" + engineCC + ", engineLiter=" + engineLiter + ", engineType=" + engineType
				+ ", engineMfg=" + engineMfg + "]";
	}
	
	
}
