package java_second;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr1 = new int[5];
		System.out.println("5개의 정수를 입력하세요.");
		
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		int c = scan.nextInt();
//		int d = scan.nextInt();
//		int e = scan.nextInt();
		
//		int[] arr1 = {a,b,c,d,e};
		
		
		for(int i = 0 ; i<arr1.length; i++) {
//			 results += arr1[i];
			arr1[i] = scan.nextInt();
		}
		
		int results = 0;
		for(int arr : arr1 ) {
			results += arr;
		}
		
		double average = (double) results / arr1.length;
		
		scan.close();
		System.out.print("평균은 "+ average);
	}
}
