import java.util.Scanner;

public class Baek2480_주사위세개 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		
		
		if(x==y && x==z) {
			System.out.println(10000+(x*1000));
		}
		else if(x == y) {
			System.out.println(1000+100*x);
		}
		else if(x == z) {
			System.out.println(1000+100*x);
		}
		else if(y == z) {
			System.out.println(1000+100*y);
		}
		else
			System.out.println(Math.max(x,Math.max(y, z))*100);

	}
}