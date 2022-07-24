import java.util.Scanner;

public class Beak1085_직사각형에서탈출 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x= scan.nextInt();
		int y= scan.nextInt();
		int w= scan.nextInt();
		int h= scan.nextInt();
		
		int row;
		int col;
		
		if(x<w-x)
			row = x;
		else
			row = w-x;
		
		if(y<h-y)
			col = y;
		else
			col = h-y;
		
		if(row<col)
			System.out.println(row);
		else
			System.out.println(col);
	}

}
