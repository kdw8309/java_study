package MyMain;

public class _002_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����� 				: �̹� ������ ��� (�ڷ���/���/��Ÿ)
		
		// ����� ������ ��Ī	: Ŭ������/�޼ҵ��/�����
		
		System.out.println("--[����� ���� ��Ī �ο��� ���(����)����]--");
		
		System.out.println("1. ���ڷ� �����ϸ� �ȵȴ�");
		
			//Ex)int kor;(ok)
			//	 int 1kor;(nope)
		
		System.out.println("2. �߰��� ������ ���� �ȵȴ�");
		
			//Ex) int mymoney;(ok)
			//	  int my money;(nope)
			//	  int myMoney;(ok) 		: camelǥ���
			//	  int my_money;(ok) 	: snakeǥ���
		
		System.out.println("3. Ư�����ڴ� ������� ���Ѵ�. �� $, _�� ����");
		
			//Ex) int email@;(nope)
		
		System.out.println("4. ������ ��� ���Ѵ�");
		
			//public, static, void, class��
		
		System.out.println("--[Ŭ��������(�ǰ����)]--");
		
		System.out.println("1. �빮�ڷ� �����Ѵ�");
		
		System.out.println("2. 2�� �̻��� �ܾ ���յǸ� �� �ܾ��� ù ���ڴ� �빮�ڷ� ����");
		
			//class MyMain : Pascalǥ���
		
		System.out.println("--[�޼ҵ�/������ ����(�ǰ����)]--");
		
		System.out.println("1. �ҹ��ڷ� �����Ѵ�");
		
		System.out.println("2. 2�� �̻��� �ܾ ���յǸ� �� �ܾ��� ù ���ڴ� �빮�ڷ� ����");
		
		System.out.println("--[��� ����(�ǰ����)]--");
		
		System.out.println("1. ��� ���ڴ� �빮�ڷ� ���");
		
		System.out.println("2. 2�� �̻��� �ܾ ����Ǹ� _�� �����Ѵ�(snake)");
		
		// 2�� ���� ���ϴ� ���
		// 1. ���� bit�������� ù��° 1�� ���� �� ���� �״�� ������
		// 2. �������� 1�� ������ ���Ѵ�
		// Ex)  001110000100
		//		         100 ������
		//		110001111    �� �ٲ۴�
		//		110001111100 2�� ����
		//		110001111011 1�� ���� 
		
		// 2�� �� ��� 900
		System.out.println(Integer.toBinaryString(900));
		
		// 900 2�� ������ ���
		System.out.println(Integer.toBinaryString(-900));
		
		
		
		
	}

}
