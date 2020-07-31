package test;

import java.util.Scanner;

// a+b 출력하는 프로그램. 
// 첫째줄에 test case 개수 입력받아서, 그 만큼만 출력하기.
public class Bj_10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		
	}
}
