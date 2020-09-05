package yuna;

// 백준 2742번
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 자연수 n이 주어졌을 때, n부터 1까지 한 줄에 하나씩 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		for(int i=a; i>0; i--) {
			System.out.println(i);
		}
		
	}
}