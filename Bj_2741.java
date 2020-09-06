package yuna;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 자연수 n이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			System.out.println(i);
		}
		
	}
}