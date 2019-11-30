package com.phoneproject;

// abstract classes can have constructors and methods with or without bodies
// bodies are all the logic that goes inbetween {} curley brackets
// if you have a method that does not have a body and is abstract 
// then you have to define it in the super class


public abstract class Phone {
	
	// attributes
	private String versionNumber;
	private int batteryPercentage;
	private String carrier;
	private String ringTone;
	
	// constructors
	public Phone (String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = batteryPercentage;
		this.carrier = carrier;
		this.ringTone = ringTone;		
	}
	
	// abstract methods. This method will be implemented by the subclass
	// and will have stuff in the {} curley brackets
	public abstract Phone displayInfo();
	
	// getters RETURN something
	public String getVersionNumber() {
		return this.versionNumber;
	}
	public int getBatteryPercentage() {
		return this.batteryPercentage;
	}
	public String getCarrier() {
		return this.carrier;
	}
	public String getRingTone() {
		return this.ringTone;
	}
	
	//setters
	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}
	public void setBatteryPercentage(int newPercent) {
		this.batteryPercentage = newPercent;
	}
	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}
	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}	

}
