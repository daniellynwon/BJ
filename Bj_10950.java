package test;

import java.util.Scanner;

// a+b ����ϴ� ���α׷�. 
// ù°�ٿ� test case ���� �Է¹޾Ƽ�, �� ��ŭ�� ����ϱ�.
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
