import java.util.Scanner;

public class Baek2439_�����2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num= scan.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j = 1;j<=num-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}public Baek2439_�����2() {
		// TODO Auto-generated constructor stub
	}
	
	
}
