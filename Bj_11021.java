package yuna;

// 백준 11021번
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램 작성.
		// 첫재 줄에 테스트 케이스 개수 T가 주어짐.
		// 0<A, B<10
		// 테스트 케이스마다 'Case #x: '출력
		int arr[];
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		arr = new int[t];
		for(int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = (a+b);
		}
		for(int i=0; i<t;i++) {
			System.out.println("Case #"+(i+1)+": "+arr[i]);			
		}
	}
}