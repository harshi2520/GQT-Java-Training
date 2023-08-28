import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		int a = 0,b = 1 , i=2 , n;
		System.out.println("Enter the value of n");
		Scanner in = new Scanner(System.in);
	    n = in.nextInt();
//		for(i = 2; i <= n; i++) {
//			int c = a + b;
//			System.out.println(c + " ");
//			a=b;
//			b=c;
//			}
	    
	    while(i <= n) {
	    	int temp = b;
	    	b = a + b;
	    	a = temp;
	    	i++;
	    }
	    System.out.println(b);
		}
	}
