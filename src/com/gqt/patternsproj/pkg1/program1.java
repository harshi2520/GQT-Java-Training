package com.gqt.patternsproj.pkg1;
import java.util.Scanner;

/*public class program1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print("$ ");
		}
	}

}*/


/*public class program1 {
      public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print("1 ");
		}
	}

}*/

/*public class program1 {
    public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			System.out.print(i+ " ");
		}
	}

}
*/


public class program1 {
    public static void main(String[] args) {
    	int count=1;
		for(int i=1;i<=5;i++) {
			System.out.print(count+ " ");
			count=count+5;
		}
	}
}

/*public class program1 {
    public static void main(String[] args) {
    	int count=30;
		for(int i=1;i<=5;i++) {
			System.out.print(count+ " ");
			count=count-5;
		}
	}
}*/

/*public class program1 {
    public static void main(String[] args) {
    	int count=25;
		for(int i=1;i<=5;i++) {
			System.out.print(count+ " ");
			count=count+5;
		}
	}
}*/

/*public class program1 {
    public static void main(String[] args) {
    	int count=25;
		for(int i=1;i<=5;i++) {
			System.out.print(count+ " ");
			count=count-5;
		}
	}
}*/

//Dynamic programming using Scanner class

/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	int count=n;
		for(int i=1;i<=n;i++) {
			System.out.print(count+ " ");
			count=count+5;
		}
	}
}*/

/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	int count=n*n;
		for(int i=1;i<=n;i++) {
			System.out.print(count+ " ");
			count=count-1;
		}
	}
}*/


/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
			System.out.print("$ ");
			
		}
    		System.out.println();
	}
}
}*/

/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
			System.out.print(i+ " " );
			
		}
    		System.out.println();
	}
}
}*/


/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	int count=1;
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
			System.out.print(count+ " " );
			count=count+3;
			
		}
    		System.out.println();
	}
}
}*/


/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	int count=1;
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
			System.out.print(count+ " " );
			count++;
			
		}
    		System.out.println();
	}
}
}*/


/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	int count=25;
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
			System.out.print(count+ " " );
			count--;
			
		}
    		System.out.println();
	}
}
}*/


/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		int count=i;
    		for(int j=1;j<=n;j++) {
			System.out.print(count+ " " );
			count=count+5;
			
		}
    		System.out.println();
	}
}
}*/

/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=n;j++) {
			System.out.print("$ " );
			}
    		for(int j=1;j<=n;j++) {
    			System.out.print("# " );
    			
    		}
    		System.out.println();
	}
}
}*/





/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
			System.out.print("@ " );
		
			
		}
    		System.out.println();
	}
}
}*/

/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		for(int j=n;j>=i;j--) {
			System.out.print("* " );
		
			
		}
    		System.out.println();
	}
}
}*/


/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		for(int j=n;j>=i;j--) {
			System.out.print("$ " );
			}
    		for(int j=1;j<=n;j++) {
    			System.out.print("# ");
    			
    		}
    		System.out.println();
	}
}
}

/*Lpublic class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
			System.out.print(i);
		
			
		}
    		System.out.println();
	}
}
}*/


/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
			}
    		System.out.println();
    	}
    		
    }
}*/

/*public class program1 {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the value of n:");
    	int n= sc.nextInt();
    	int count=1;
    	for(int i=1;i<=n;i++) {
    		for(int j=1;j<=i;j++) {
			System.out.print(count+" ");
			count++;
			}
    		System.out.println();
    	}
    		
    }
}
*/








