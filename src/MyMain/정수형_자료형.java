package MyMain;

public class 정수형_자료형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);//기본형 int
		System.out.println(1L);//long형
		System.out.println(100);//10진수
		System.out.println(0x64);//16진수 	: 0x(숫자 0)
		System.out.println(0144);//8진수 	: 0	(숫자 0)
		
		//100에 대한 진수값
		System.out.printf("10진수 : %d\n", 100);//10진수
		System.out.printf("16진수 : %x\n",100);//16진수
		System.out.printf("8진수  : %o\n",100);//8진수
		
		
		//자릿수 지정해서 출력
		int n = 123;
		
		//공백 포함해서 10자리
		System.out.printf("[%10d]\n", n);
		
		//빈 공간에 0넣어라
		System.out.printf("[%010d]\n", n);
		
		//왼쪽 정렬해라 : 여기에는 0을 사용 할 수 없다 왜? 값이 변하니까 
		System.out.printf("[%-10d]\n", n);
		
		
		
	}

}
