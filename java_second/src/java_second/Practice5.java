package java_second;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
// 문자열 입력, 배열 크기 음수일때

public class Practice5 {

	public static void main(String[] args) {
		
		try {} catch(InputMismatchException e) {
			System.out.println("오류발생: 배열의 크기는 정수로 입력하세요.");
		} catch(NegativeArraySizeException e) {
			System.out.println("오류발생: 배열의 크기는 0보다 큼");
		}
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 크기를 입력하세요 : ");
		int input = scan.nextInt();
		
		// 사용자가 입력한 배열 요소 추가
		ArrayList<Integer> list = new ArrayList<>();
		// 중복된 숫자 배열
		ArrayList<Integer> duplicate = new ArrayList<>();
		
		System.out.print("배열 요소를 입려하세요.");
		for(int i = 0; i < input; i++ ) {
			int input2 = scan.nextInt();
			
			list.add(input2);
			
			if(list.contains(input2) && !duplicate.contains(input2)) {
				duplicate.add(input2);
			}
			list.add(input2)
;		}
		
			System.out.println("중복된 숫자 서브 배열");
			

	}

}
