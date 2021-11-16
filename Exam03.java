
public class Exam03 {

	public static void main(String[] args) {
		
		//문제. 선생님과 나의 나이를 바꿔봅시다.
		
		int teacher = 20;
		int my = 29;
		//아래의 코드를 작성하여 나의 나이 값과 선생님의 나이 값을 서로 바꿔주세요. - 치환문제!
		int temp; // temp = 일시적으로 저장할 공간을 지칭
		temp = my;
		my = teacher;
		teacher = temp;
		
		System.out.println("선생님의 나이 : " + teacher);
		System.out.println("나의 나이 : " + my);

	}

}
