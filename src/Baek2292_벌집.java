import java.util.Scanner;

public class Baek2292_¹úÁý {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int count = 1;
		int first = 2;
		
		if(N==1)
			System.out.println("1");
		
		while(first<=N) {
			first = first + (6*count);
			count++;
		}
	
	System.out.println(count);
}
}
