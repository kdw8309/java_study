package MyMain;

public class _03_�Ǽ����ڷ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�Ǽ��� : float double
		
		System.err.println(1.0);//double�� �⺻��
		System.out.println(1.0F);//float��
		//������ ne + n : n * 10�� 2��
		
		double d = 12.34567890123456789;
		
		System.out.printf("%f\n", d);//�Ҽ��� 6�ڸ�
		System.out.printf("%e\n", d);//�Ҽ��� 6�ڸ�
		System.out.printf("%g\n", d);//���� ����
		
		double pi = Math.PI;
		
		System.out.printf("%f\n", pi);
		
		//20�ڸ� ���
		System.out.printf("[%20f]\n", pi);
		
		
		
		
	}

}
