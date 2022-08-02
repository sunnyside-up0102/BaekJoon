import java.util.Scanner;

public class Baek2798_∫Ì∑¢¿Ë {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int N = scan.nextInt();
	int M = scan.nextInt();
	int[] arr = new int[N];
	int sum=0;
	int temp=0;
	for(int i=0;i<arr.length;i++) {
		arr[i] = scan.nextInt();
	}
		
	for(int i = 0 ; i<arr.length ; i++) {
		for(int j = i+1 ; j<arr.length;j++) {
			for(int k = j+1 ; k<arr.length ; k++) {
				sum = arr[i] + arr[j] + arr[k];
				
				if(temp < sum && sum <=M) {
					temp = sum;
				}
			}
		}
	}
		System.out.println(temp);
	}
}