import java.util.Scanner;

public class Baek10250_ACMÈ£ÅÚ {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 0 ; i<T;i++) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			int N = scan.nextInt();
			
			if(N%H == 0) {
				int y = H;
				int x = N/H;
				System.out.println(y*100 + x);
			}
			else {
				int y = N%H;
				int x = N/H +1;
				System.out.println(y*100+x);
			}
		}

	}

}
