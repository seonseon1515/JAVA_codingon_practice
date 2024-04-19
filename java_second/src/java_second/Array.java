package java_second;
import java.util.Arrays;

public class Array {
	// 가변적 매개변수
	// 매개변수가 여러개일 때, 가변적 매개변수는 항상 마지막 인수로 넣어주기
	public static int addNumbers(String str,int...nums) {
		System.out.println("String: " + str);
		int total = 0;
		for(int num: nums) {
			total += num;
		}
		return total;
	}
	
	public static void main(String[] args) {
		// 배열의 선언
		int [] arr1 = new int[10]; // 정수 10개를 저정하는 배열, 0으로 초기화
		// 터미널 창에 jshell 치면 자바 코드 콘솔에서 칠 수 있음
		int[] arr2 = {1,2,3,4,5}; // 초기값을 가지는 배열
		// 대괄호는 개수를 나타내고, 값은 중괄호
		int[] arr3;
		arr3 = new int[5]; // 나중에 배열을 초기화
	
		// 배열 안에 값 넣기
		arr1[3] = 300;
//		System.out.println(Arrays.toString(arr1));
		
		// 배열 출력
		for(int arr: arr2) {
//			System.out.print(arr + " ");
		}
		
		// 2차원 배열
		// 선언
		int [][] matrix = {
				{1,2,3},
				{4,5,6},
				{7,8,9}, // 3(값의 갯수)X3(행) 배열
		};
		
		// 출력
		for(int[] row: matrix) {
			for(int num : row) {
//				System.out.print(num + " ");
			}
		}
		
		matrix[0][1] = 100;
		for(int i =0; i < matrix.length; i++) {
			for(int j =0 ; j <matrix[0].length; j++) {
				System.out.print(matrix[i][j]+" ");
			}
		}
		
		int sum = addNumbers("Hi", 1,2,3,4,5);
		System.out.println("가변매개변수: " + sum);
	}
}
