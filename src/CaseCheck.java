import java.util.Scanner;
public class CaseCheck {

	public static void main(String[] args) {
		System.out.println("Enter the String");
		Scanner in = new Scanner(System.in);
		char ch = in.next().trim().charAt(0);
		if(ch >= 'a' && ch <= 'z') {
        		System.out.println("Character is lowercase");
        	}
		else {
			System.out.println("Character is uppercase");
		}
		
	}

}
