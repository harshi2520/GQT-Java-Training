import java.util.Scanner;
public class CountNums {

	public static void main(String[] args) {
		System.out.println("Enter the value of n ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int count=0;
		while(n > 0) {
			int rem = n % 10;
			if(rem==3) {
			count++;
		}
		n= n / 10;
		}
		System.out.println(count);
		}
}

//Count how many times the number is repeated