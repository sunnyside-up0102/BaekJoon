//N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오. (배열)
//입력예시
//5
//20 10 35 30 7
//출력 예시
//7 35

import java.util.Arrays;
import java.util.Scanner;

public class Baek10818_최소최대 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int[] arr = new int[n];
	

	for(int i=0;i<n;i++) {
		arr[i] = scan.nextInt();	//입력받기
	}
	scan.close();
	Arrays.sort(arr);	
	System.out.print(arr[0] + " " + arr[n-1]);

	
	}

}

//for(int i=0;i<n;i++) {	//TEST
//System.out.print(arr[i] + " ");
//}
//