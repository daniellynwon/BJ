package test;

import java.util.Scanner;

// 사분면 구하기.

// 1. x,y 두개의 수를 받기.
// 2. x,y 둘 다 양수라면 -> A. x가 음수, y가 양수이면 B. x가 양수, y가 음수이면 D. 둘 다 음수이면 C.
// 3. A B C D -> 1 2 3 4 로 출력.

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
