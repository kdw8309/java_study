package MyMain;

public class ������_�ڷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);//�⺻�� int
		System.out.println(1L);//long��
		System.out.println(100);//10����
		System.out.println(0x64);//16���� 	: 0x(���� 0)
		System.out.println(0144);//8���� 	: 0	(���� 0)
		
		//100�� ���� ������
		System.out.printf("10���� : %d\n", 100);//10����
		System.out.printf("16���� : %x\n",100);//16����
		System.out.printf("8����  : %o\n",100);//8����
		
		
		//�ڸ��� �����ؼ� ���
		int n = 123;
		
		//���� �����ؼ� 10�ڸ�
		System.out.printf("[%10d]\n", n);
		
		//�� ������ 0�־��
		System.out.printf("[%010d]\n", n);
		
		//���� �����ض� : ���⿡�� 0�� ��� �� �� ���� ��? ���� ���ϴϱ� 
		System.out.printf("[%-10d]\n", n);
		
		
		
	}

}
