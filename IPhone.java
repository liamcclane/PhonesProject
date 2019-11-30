package com.phoneproject;

public class IPhone extends Phone implements Ringable{
	
	// attributes inside the Phone abstract class
	
	// constructors
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	
	// abstract methods that need to be defined in the super class
	@Override
    public IPhone ring() {
    	System.out.println("iPhone " + getVersionNumber() + " says : " + getRingTone());
    	return this;
        // your code here
    }
	
	@Override
    public IPhone unlock() {
        // your code here
		System.out.println("iPhone "+ getVersionNumber() +" was unlocked via face reconigation");
		return this;
    }
    
	@Override
    public IPhone displayInfo() {
		System.out.println("iPhone " + getVersionNumber()+ " from " + getCarrier());
		System.out.println("\t Battery Percentage is at : "+ getBatteryPercentage());
		return this;
    }
}
