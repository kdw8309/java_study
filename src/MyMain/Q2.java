package MyMain;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������
		double radius;
		
		//���ѷ� : 2 * pi * radius
		double circle_len;
		
		//������ : radius * radius * pi
		double circle_area;
		
		Scanner scanner = new Scanner(System.in);
		
		radius = scanner.nextDouble();
		
		circle_len = 2 * Math.PI * radius;
		
		circle_area = radius * radius * Math.PI;
		
		System.out.printf("�������� %.1f �� ���� �ѷ��� %.1f�̰� ������ %.1f�Դϴ�.\n", radius, circle_len, circle_area);
	}

}
