package com.phoneproject;

public class Galaxy extends Phone implements Ringable {
	
	// attributes inside the Phone abstract class
	
	// constructor
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	
	
    @Override
    public Galaxy ring() {
        System.out.println("Galaxy " + getVersionNumber() + " says " + getRingTone());
    	return this;
    }
    @Override
    public Galaxy unlock() {
    	System.out.println("Galaxy " + getVersionNumber() + " was unlocked fingerprint");
    	return this;
    }
    @Override
    public Galaxy displayInfo() {
    	System.out.println("Galaxy " + getVersionNumber() + " from "+ getCarrier());
    	System.out.println("\t The battery is at: " + getBatteryPercentage());
    	return this;
    }
}
