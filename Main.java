package yuna;

// 백준 2438번 별 찍기 -1
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		// 첫째 줄부터 N번째 줄까지 차례대로 별 출력.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// N 입력값.
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			} System.out.println("");
		}
	}
}