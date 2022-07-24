import java.util.Scanner;

public class Baek2562_ÃÖ´ñ°ª {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int[] arr = new int [9];
	int count = 0;
	int max =0;
	
	for(int i=0;i<9;i++) {
		arr[i] = scan.nextInt();
	}
	
	for(int i=0;i<9;i++) {
		if(arr[i]>max) {
			max = arr[i];
			count = i+1;
		}
	}
	
	
	System.out.println(max);
	System.out.println(count);
	}

}
