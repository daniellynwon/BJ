package test;

import java.util.Scanner;

// ���� ���ϱ�. �����̸� 1, �ƴϸ� 0���
// ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ��.
public class Bj_2753 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4==0 && year%100!=0) {
			System.out.println("1");
		}else if(year%4==0 && year%400==0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
	}
}
