package com.Constructors.pkg;                          //Multiple constructors

public class Cuboid {
	int width;
	int height;
	int depth;
	
	public Cuboid(int width,int height,int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
		
	}
	
	public Cuboid(int width,int height) {   //java does allow the use of multiple constructors in the same class
		this.width=width;
		this.height=height;
		this.depth=10; //constant for each and every call
	}

	public Cuboid(int dimension) {    //Setting same value for all
		width=dimension;
		height=dimension;
		depth=dimension;
	}
	
	public Cuboid() {      //All the objects are going to hold the same values for all the properties
		this.width=10;    //Static Values
		this.height=10;
		this.depth=10;
	}
	
	int volume() {
		return width * height * depth;
		
	}
	
	
	public static void main(String[] args) {
		int volume;
		
		Cuboid stdCuboid=new Cuboid(10,20,30);
		volume=stdCuboid.volume();
		System.out.println("The volume of the stdCuboid is:" + volume);
		
		Cuboid cuboidWithDefaults=new Cuboid(10,20);
		volume=cuboidWithDefaults.volume();
		System.out.println("The volume of the CuboidwithDefaults is:" + volume);
		
		Cuboid cube=new Cuboid(50);
		volume=cube.volume();
		System.out.println("The volume of the Cube is:" + volume);
		
		
		Cuboid defaultCuboid=new Cuboid();
		volume=defaultCuboid.volume();
		System.out.println("The volume of the defaultCuboid is:" + volume);
		}

}
