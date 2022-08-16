package MyMain;

public class _002_명명법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 예약어 				: 이미 생성된 명령 (자료형/제어문/기타)
		
		// 사용자 지정의 명칭	: 클래스명/메소드명/상수명
		
		System.out.println("--[사용자 지정 명칭 부여시 고려(제약)사항]--");
		
		System.out.println("1. 숫자로 시작하면 안된다");
		
			//Ex)int kor;(ok)
			//	 int 1kor;(nope)
		
		System.out.println("2. 중간에 공백을 띄우면 안된다");
		
			//Ex) int mymoney;(ok)
			//	  int my money;(nope)
			//	  int myMoney;(ok) 		: camel표기법
			//	  int my_money;(ok) 	: snake표기법
		
		System.out.println("3. 특수문자는 사용하지 못한다. 단 $, _는 제외");
		
			//Ex) int email@;(nope)
		
		System.out.println("4. 예약어는 사용 못한다");
		
			//public, static, void, class등
		
		System.out.println("--[클래스명명법(권고사항)]--");
		
		System.out.println("1. 대문자로 시작한다");
		
		System.out.println("2. 2개 이상의 단어가 조합되면 매 단어의 첫 글자는 대문자로 쓴다");
		
			//class MyMain : Pascal표기법
		
		System.out.println("--[메소드/변수명 명명법(권고사항)]--");
		
		System.out.println("1. 소문자로 시작한다");
		
		System.out.println("2. 2개 이상의 단어가 조합되면 매 단어의 첫 글자는 대문자로 쓴다");
		
		System.out.println("--[상수 명명법(권고사항)]--");
		
		System.out.println("1. 모든 문자는 대문자로 기록");
		
		System.out.println("2. 2개 이상의 단어가 연결되면 _로 연결한다(snake)");
		
		// 2의 보수 구하는 방법
		// 1. 하위 bit에서부터 첫번째 1이 나올 때 까지 그대로 내린다
		// 2. 나머지는 1의 보수를 취한다
		// Ex)  001110000100
		//		         100 내린다
		//		110001111    로 바꾼다
		//		110001111100 2의 보수
		//		110001111011 1의 보수 
		
		// 2진 값 출력 900
		System.out.println(Integer.toBinaryString(900));
		
		// 900 2의 보수로 출력
		System.out.println(Integer.toBinaryString(-900));
		
		
		
		
	}

}
