package test;

import java.util.Scanner;

// ��и� ���ϱ�.

// 1. x,y �ΰ��� ���� �ޱ�.
// 2. x,y �� �� ������ -> A. x�� ����, y�� ����̸� B. x�� ���, y�� �����̸� D. �� �� �����̸� C.
// 3. A B C D -> 1 2 3 4 �� ���.

public class Bj_14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x>0 && y>0) {
			System.out.println("1");
		}else if(x<0 && y>0) {
			System.out.println("2");
		}else if(x>0 && y<0) {
			System.out.println("4");
		}else if(x<0 && y<0) {
			System.out.println("3");
		}
	}
}
