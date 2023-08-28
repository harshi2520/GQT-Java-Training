package com.harshi.inheritence.pkg;

public class MountainBike extends Bicycle{
	
	public int seatHeight;
	
	public MountainBike(int seatHeight,int StartSpeed,int StartGear) {
		super(StartSpeed,StartGear); //to refer to the base class constructor
		this.seatHeight=seatHeight;
	}
	
	public void seatHeight(int newValue) {
		seatHeight=newValue;
	}

}
