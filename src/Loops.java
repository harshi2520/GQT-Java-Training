
public class Loops {

	public static void main(String[] args) {
//		int a=10;
//		if(a==10) {
//			System.out.println("Hello world");
//		}
		
		
		//while loop - wn you don't know how many times the loop is going to run use this
//		int count = 1;
//		while(count<5) {
//			System.out.println("How r u");
//			count++;
//		}
//		

		//for loop - wn you know how many times the loop is going to run use this
//		for(int count=1;count!=5;count++) {
//			System.out.println(count);
//		}
		
		int salary = 23000;
//		if(salary > 10000) {
//			salary = salary + 2000;
//		}else {
//			salary = salary + 1000;
//		}
		
		// Multiple if-else statements
		
		if(salary>10000) {
			salary+=2000;
		}else if(salary>20000){
			salary+=3000;
		}else {
			salary+=1000;
		}
		
		System.out.println(salary);
	}

}
