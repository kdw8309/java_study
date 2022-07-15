package MyMain;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//반지름
		double radius;
		
		//원둘레 : 2 * pi * radius
		double circle_len;
		
		//원면적 : radius * radius * pi
		double circle_area;
		
		Scanner scanner = new Scanner(System.in);
		
		radius = scanner.nextDouble();
		
		circle_len = 2 * Math.PI * radius;
		
		circle_area = radius * radius * Math.PI;
		
		System.out.printf("반지름이 %.1f 인 원의 둘레는 %.1f이고 면적은 %.1f입니다.\n", radius, circle_len, circle_area);
	}

}
