package test;

import java.util.Scanner;

// 합.
// n이 주어졌을 때, 1부터 n까지의 합을 구하기.
public class Bj_8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
