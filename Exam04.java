
public class Exam04 {

	public static void main(String[] args) {
		//�������� �ڷ���
		//�⺻Ÿ�԰� ����Ÿ������ ������.
		
		//1.�⺻ �ڷ��� 2.���۷��� �ڷ���
		/*1. �⺻�ڷ����� ����(8����)
		 	1) ������ (byte, short, int, long)
		 	byte - 1byte(2��8�� = 256)(= -128���� 127���� ǥ���Ҽ��ִ�.)
		 	short - 2byte(2��16��)
		 	int - 4byte(2��32��)
		 	long - 8byte
		*/		
		byte num1 = 127;
		short num2 = 5000;
		int num3 = 200000;
		long num4 = 200000000;
		
		/* 	2) �Ǽ���(float, double)
		  	float - 4byte
			�ڹٿ��� �Ǽ����� �⺻������ double�� �ν��Ѵ�.
			double - 8byte
		 */
		float num5 = 10.4f; //���ڵڿ� f�� ���̸� float�� ����. or (float)�� ���� �տ� ���´�.
		double num6 = 2134.24;
		
		/* 	3) ����(boolean) : true or false �� ����.
		 	boolean - 1byte
		 */
		boolean isCheck = true;
		isCheck = false;
		
		/*	4) ������(char)(char�� �������� �����̴�!)
		 	char - 2byte
		 */
		char text = 'a'; // ���ڴ� '', ���ڿ��� ""
		text = '��';
		
		//��ǥ������ ��� : boolean, char, int, double
		
		//char�� �������� ����
		char test = 'A';
		int num10 = test;
		System.out.println(num10);
		
		/* ������ ��Ģ
		 	1. Ű���� ��� �Ұ�(�۾��� �β������� Ű�����̴�!)
		 	2. ��ҹ��ڰ� ���еǸ� ���̿� ������ ����.(int True�� int true�� �ٸ���)
		 	3. ���ڷ� ���� �� �� ����.
		 	4. Ư�����ڴ� '_' �� '$'�� ����Ѵ�.
		  * �ַ� camelcase�� ����Ѵ�.(�� �ձ��ڸ� ������ �ܾ�� �빮��)
		  * ������ �ǹ̸� �� �� �ְ� �ؾ��Ѵ�!!!.(������ ������ִ� ����Ʈ : https://www.curioustore.com)
		 */
		
		
		
		
	}

}
