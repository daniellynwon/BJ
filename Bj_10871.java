package yuna;

// 백준 10871번 X보다 작은 수
import java.util.Scanner;

public class Bj_10871 {
	public static void main(String[] args) {
		// 첫째 줄에 N과 X. (1<=N, X<=10,000)
		// 둘째 줄에 수열 A를 이루는 정수 N개
		// X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력. X보다 작은 수 at least 하나 존재.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// N 입력값.
		int x = sc.nextInt();		// X 입력값.
		
		int[] arr = new int [n];
		// for문 사용하여 입력된 값 배열에 넣기.
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();		// 입력된 값 배열에 넣음.
			// 입력받은 값 중 X보다 작은 수를 입력받은 순서대로 출력.
			if(arr[i]<x) {
				System.out.print(arr[i]+" ");
			}
		}
				
	}
}