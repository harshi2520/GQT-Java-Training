package com.harshi.inheritence.pkg;

public class Bicycle {
	
	protected  int speed;
	protected  int gear;

public Bicycle(int StartSpeed,int StartGear) {
	this.speed=StartSpeed;
	this.gear=StartGear;
	
}

public void setGear(int newValue) {
	gear=newValue;
	
}

public void applyBrake(int decrement) {
	speed-= decrement;
}

public void speedUp(int increment) {
	speed+=increment;
}

}
