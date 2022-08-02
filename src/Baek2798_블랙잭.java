import java.util.Scanner;

public class Baek2798_∫Ì∑¢¿Ë {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int M = scan.nextInt();
		int sum = 0;
		int tmp = 0;
		int[] arr = new int[N];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		
		
		
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				for(int k = j+1;k<arr.length;k++) {
					sum = arr[i] + arr[j] + arr[k];
					
					if(tmp<sum && sum<=M) {
						tmp = sum;
					}
				}
			}
		}
		System.out.println(tmp);
		}
}
