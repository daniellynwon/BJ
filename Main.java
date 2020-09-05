package yuna;

// 백준 11022번
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램 작성.
		// 첫재 줄에 테스트 케이스 개수 T가 주어짐.
		// 0<A, B<10
		// 테스트 케이스마다 'Case #x: A + B = C ' 형식으로 출력
		int arr1[][];
		int arr2[];
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();		// 테스트 케이스 개수 받기.
		arr1 = new int[t][t];		// a와 b 담을 배열
		arr2 = new int[t];		// 테스트 케이스만큼 숫자 넣을 배열.
		for(int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr1[i][0] = a;
			arr1[i][1] = b;
			arr2[i] = (a+b);		// 배열에 A,B 합한 값 넣기.
		}
		for(int i=0; i<t;i++) {
			System.out.println("Case #"+(i+1)+": "+arr1[i][0]+" + "+arr1[i][1]+" = "+arr2[i]);			
		}
	}
}