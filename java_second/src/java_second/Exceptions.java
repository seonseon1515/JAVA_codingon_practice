package java_second;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Exceptions {

	public static void main(String[] args) {
		// 숫자를 0으로 나눈 경우 
		try {
			int num1 = 4;
			int num2 = 0;
			System.out.printf("num1 / num2 = %d", num1/num2);
		} catch(ArithmeticException e) {
			// 프론트 개발자가 보고 수정할 수 있도록 발생하는 오류에 대한 예외처리
		System.out.println("0으로 나누어 예외 발생");
		System.out.println(e);
		}
		
		// 인덱스의 범위를 벗어났을 때의 오류 처리
		int[] intArray = {1,2,3,4};
		
		try {
		for(int i = 0; i<5; i++) {
			System.out.println(intArray[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위가 벗어났습니다.");		
		}
		
		
		// 오류 코드를 잘 모를 시 먼저 발생시키고 콘솔에 뜨는 오류 메시지를 참고하여 try-catch문 작성
		// 입력오류 발생 시 
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		try {
			int num = scan.nextInt();
			System.out.println("입력된 정수는 " + num);
		} catch(InputMismatchException e) {
			System.out.println("입력 오류, 정수를 입력하세요. ");
		}
		
		
		// null 에 접근하는 경우
		// 예외처리가 되면 프로그램은 계속 실행됨
		String text= null;
		try {
			System.out.println(text.length());			
		} catch (NullPointerException e){
			System.out.println("Null 값에 접근할 수 없습니다.");
		}
	}

}
