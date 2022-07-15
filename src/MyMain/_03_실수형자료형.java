package MyMain;

public class _03_실수형자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//실수형 : float double
		
		System.err.println(1.0);//double이 기본형
		System.out.println(1.0F);//float형
		//지수형 ne + n : n * 10의 2승
		
		double d = 12.34567890123456789;
		
		System.out.printf("%f\n", d);//소수점 6자리
		System.out.printf("%e\n", d);//소수점 6자리
		System.out.printf("%g\n", d);//기준 없음
		
		double pi = Math.PI;
		
		System.out.printf("%f\n", pi);
		
		//20자리 출력
		System.out.printf("[%20f]\n", pi);
		
		
		
		
	}

}
