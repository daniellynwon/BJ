package yuna;

// ���� 2439�� �� ��� -2
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����, -> ������ ����.
		// ù° �ٿ� N(1 �� N �� 100)�� �־�����.
		// ù° �ٺ��� N��° �ٱ��� ���ʴ�� �� ���.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// N �Է°�.
		for(int i=1;i<=n;i++) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}