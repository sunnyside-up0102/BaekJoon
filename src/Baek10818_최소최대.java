//N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. (�迭)
//�Է¿���
//5
//20 10 35 30 7
//��� ����
//7 35

import java.util.Arrays;
import java.util.Scanner;

public class Baek10818_�ּ��ִ� {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int n = scan.nextInt();
	int[] arr = new int[n];
	

	for(int i=0;i<n;i++) {
		arr[i] = scan.nextInt();	//�Է¹ޱ�
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