package java_second;
import java.util.Scanner;
import java.util.InputMismatchException;
//import java.util.ArithmeticException;
//import java.util.NegativeArraySizeException;


public class Practice4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("배열의 크기를 입력하세요.");
			int input = scan.nextInt();
			
			// 배열 크기를 음수로 입력했을 경우
			if(input < 0) {
				throw new NegativeArraySizeException("배열 크기는 음수가 될 수 없습니다.")	
			}
			if(input == 0) {
				throw new ArithmeticException("배열크기는 0이 될 수 없습니다.")
			}
			
			int[] arr = new int[input];
			
			System.out.println("배열 요소 입력");
			for(int i = 0; i <input; i++) {
				arr[i] = scan.nextInt();
			}
			
			int sum = 0;
			for(int num: arr) {
				sum+=num;
			}
			
			double avg = (double) sum / input;
			
		} catch(InputMismatchException e) {
			System.out.println("오류발생: 배열크기는 정수로 입력하세요.");
			// try,catch는 런타임 오류에서 발생
			// 컴파일 오류는 아예 실행 자체가 안됨
		} catch(ArithmeticException e) {
			System.out.println("오류발생: 배열 크기는 0이 될 수 없습니다.");
		} catch(NegativeArraySizeException e) {
			System.out.println("오류발생: 배열 크기는 음수가 될 수 없습니다." + e.getMessage());
			
		} finally{
			scan.close();
		}
		
		System.out.println("평균 값은 "+ avg +" 입니다.");
	}

}
