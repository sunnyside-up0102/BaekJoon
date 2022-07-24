import java.util.Scanner;

public class Baek4153_Á÷°¢»ï°¢Çü {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true) {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a==0 && b==0 && c==0) break;
		
		if( (a*a + b*b) == c*c)
			System.out.println("right");
		else if( (a*a + c*c) == b*b)
			System.out.println("right");
		else if( (c*c + b*b) == a*a)
			System.out.println("right");
		
		else
			System.out.println("wrong");
		}
		
	}

}
