package com.phoneproject;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone liaPhone = new IPhone("7", 98, "Verison", "Buzz Buzz");
		Galaxy brandonPhone = new Galaxy("9S",52, "AT&T", "Hey Baby Hey Baby Hey");
		
		liaPhone.ring().unlock().displayInfo();
		brandonPhone.ring().unlock().displayInfo();

	}

}
