package java_second;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Practice3 {

	
	public static void main(String[] args) {
		// 예외처리 실습
		
		// 오류1) 문자, 문자열 입력 - InputMismatchException
		// 오류2) 0 입력 시 오류 - ArithmeticException
		// 오류3) 음수 입력 - NegativeArraySizeException
		
		Scanner scan = new Scanner(System.in);
		
		try {
			System.out.println("숫자의 개수를 입력해주세요.");
			int arraySize = scan.nextInt();
			
			int[] intArray = new int[arraySize];
			int sum = 0;
			System.out.println("평균을 계산할 숫자를 각각 입력하세요.");
			for(int i = 0 ; i <arraySize ; i++) {
				intArray[i] = scan.nextInt();}
			for(int num: intArray) {
				sum += num;
				}
			System.out.println("평균은 " + sum/arraySize + "입니다.");
		} catch(InputMismatchException e) {
			System.out.println("정수만 입력해주세요.");
		}
	}

}
