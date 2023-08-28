import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		System.out.println("Enter the input");
		Scanner in=new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
//		if(a > b && a > c ) {
//			System.out.println("a is the largest");
//		}
//			else if(b > a && b > c) {
//				System.out.println("b is the largest");
//			}else {
//			System.out.println("c is the largest");
//			}
		
		//another way
		int max = a;
		if(b > max) {
			max = b;
			}
		if(c > max) {
			max = c;
			}
		System.out.println("largest is " + max);
		}
}
