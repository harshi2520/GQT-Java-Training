package com.harshi.inheritence.pkg;

public class InheritenceDemo {

	public static void main(String[] args) {
		MountainBike MB=new MountainBike(20,10,2);
		System.out.println("Gear is: " + MB.gear);
		System.out.println("Speed is: " + MB.speed);
		System.out.println("Seat height:  is " + MB.seatHeight);
		MB.speedUp(3);
		MB.applyBrake(2); 
		System.out.println("Bike speed after speed up: " + MB.speed);
	}

}
