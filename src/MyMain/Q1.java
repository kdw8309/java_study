package MyMain;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int width 	= 	20;
		int height	=	40;
		
		int square	=	width * height;
		
		System.out.println(square);
		
		Scanner scanner = new Scanner(System.in);
		
		width 	= scanner.nextInt();
		height 	= scanner.nextInt();
		
		int area = width * height;
		
		System.out.println(area);
		
		
	}

}
