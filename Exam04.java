
public class Exam04 {

	public static void main(String[] args) {
		//여러가지 자료형
		//기본타입과 참조타입으로 나뉜다.
		
		//1.기본 자료형 2.레퍼런스 자료형
		/*1. 기본자료형의 종류(8가지)
		 	1) 정수형 (byte, short, int, long)
		 	byte - 1byte(2의8승 = 256)(= -128부터 127까지 표현할수있다.)
		 	short - 2byte(2의16승)
		 	int - 4byte(2의32승)
		 	long - 8byte
		*/		
		byte num1 = 127;
		short num2 = 5000;
		int num3 = 200000;
		long num4 = 200000000;
		
		/* 	2) 실수형(float, double)
		  	float - 4byte
			자바에서 실수형은 기본적으로 double로 인식한다.
			double - 8byte
		 */
		float num5 = 10.4f; //숫자뒤에 f를 붙이면 float로 가능. or (float)를 숫자 앞에 적는다.
		double num6 = 2134.24;
		
		/* 	3) 논리형(boolean) : true or false 만 들어간다.
		 	boolean - 1byte
		 */
		boolean isCheck = true;
		isCheck = false;
		
		/*	4) 문자형(char)(char은 문자이자 숫자이다!)
		 	char - 2byte
		 */
		char text = 'a'; // 문자는 '', 문자열은 ""
		text = '가';
		
		//대표적으로 사용 : boolean, char, int, double
		
		//char은 문자이자 숫자
		char test = 'A';
		int num10 = test;
		System.out.println(num10);
		
		/* 변수명 규칙
		 	1. 키워드 사용 불가(글씨가 두꺼워지면 키워드이다!)
		 	2. 대소문자가 구분되며 길이에 제한이 없다.(int True와 int true는 다르다)
		 	3. 숫자로 시작 할 수 없다.
		 	4. 특수문자는 '_' 와 '$'만 허용한다.
		  * 주로 camelcase를 사용한다.(맨 앞글자를 제외한 단어마다 대문자)
		  * 변수는 의미를 알 수 있게 해야한다!!!.(변수명 만들어주는 사이트 : https://www.curioustore.com)
		 */
		
		
		
		
	}

}
