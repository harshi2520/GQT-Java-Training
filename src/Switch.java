import java.util.Scanner;
public class Switch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
//		String fruit = in.next();
		
//		String a = "Kunal";
//		String b = "Kunal";
//		
//		System.out.println(a == b);/* a==b checks the reference of the object
//		                              that is there is only one kunal object 
//		                              both a and b are pointing to the same object.*/
//        switch(fruit) {
//        case "Mango":
//        	System.out.println("Mango is the king fruit");
//        	break;
//        case "Apple":
//        	System.out.println("It is a red fruit");
//        	break;
//        case "Orange":
//        	System.out.println("Orange is round fruit");
//        	break;
//        case "Grapes":
//        	System.out.println("grapes is a bunch");
//        	break;
//        default:
//        	System.out.println("Invalid fruit");
//        	}
		
		
		
		int day = in.nextInt();
		switch(day) {
		case 1 -> System.out.println("Monday");
		case 2 -> System.out.println("Tuesday");
		case 3 -> System.out.println("Wednesday");
		case 4 -> System.out.println("Thursday");
		case 5 -> System.out.println("Friday");
		case 6 -> System.out.println("Saturday");
		case 7 -> System.out.println("sunday");
    	
		}
	}

}
