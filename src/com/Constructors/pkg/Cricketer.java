package com.Constructors.pkg;

public class Cricketer {
	String name;
	int age;
	String country;
	int runs;
	int jersey_no;
	
	public Cricketer(String name,int age,String country,int runs,int jersey_no) {           //Parameterized Constructer
		this.name=name;
		this.age=age;
		this.country=country;
		this.runs=runs;
		this.jersey_no=jersey_no;
		
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public int getRuns() {
		return runs;
	}
	
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	public int getJersey_no() {
		return jersey_no;
	}
	
	public void setJersey_no(int jersey_no) {
		this.jersey_no = jersey_no;
	}



	public static void main(String[] args) {
		Cricketer c1=new Cricketer("Virat",32,"India",6000,18);
		
		System.out.print(c1.getName()+" ");
		System.out.print(c1.getAge()+ " ");
		System.out.print(c1.getCountry()+" ");
		System.out.print(c1.getRuns()+" ");
		System.out.print(c1.getJersey_no()+" ");
		
		System.out.println("\n ");
		
        Cricketer c2=new Cricketer("ABD",35,"South Africa",4000,17);
		
		System.out.println(c2.getName());
		System.out.println(c2.getAge());
		System.out.println(c2.getCountry());
		System.out.println(c2.getRuns());
		System.out.println(c2.getJersey_no());
		
		
		
		
		

	}

}
