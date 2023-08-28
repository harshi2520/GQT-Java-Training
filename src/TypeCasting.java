import java.util.Scanner;
public class TypeCasting {

	public static void main(String[] args) {
		//Converting a bigger number into a smaller number type
		Scanner input=new Scanner(System.in);
//		int a=(int)437.89;  //Narrow typecasting or explicit typecasting
//		System.out.println(a);
//	
//		float b=564; //automatically converting from smaller to bigger
//		System.out.println(b);
//		
		
//		int a= 258;
//		byte b=(byte)a;
//		System.out.println(b); // this gives remainder 2 bcoz byte can store only upto 256
//		
//		byte a=2;
//		byte b=100;
//		byte c=67;
//		int d=a*b/c;
//		System.out.println(d);//utomatically it converts to int wn multiplied bytes
		
//		int number='a';
//		System.out.println(number);
		
//		byte b=50;
//		b=b* 2;  //error
//		System.out.println(b);
//		
		//java is a unicode language bcoz it can print all the languages
		
		byte b = 65;
	    char c='a';
	    short s=1024;
	    int i=6473;
	    float f=684.87f;
	    double d=578367.86656;
	    double result = (i*b)+(s*c)+(d*b);
	    System.out.println((i*b) + " " + (s*c) + " " + (d*b));
	    System.out.println(result);
	    

	}

}
