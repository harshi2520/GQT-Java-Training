package com.Constructors.pkg;

public class Student {
	String name;
	int age;
	String address;
	
	public Student() {    //Zero parameterized Constructor
		 name="Harshi";
		 age=21;
		 address="Anekal";
		}
	

	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getAddress());
		}

}
