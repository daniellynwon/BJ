package yuna;

// ���� 2438�� �� ��� -1
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		// ù° �ٿ� N(1 �� N �� 100)�� �־�����.
		// ù° �ٺ��� N��° �ٱ��� ���ʴ�� �� ���.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// N �Է°�.
		for(int i=1;i<=n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			} System.out.println("");
		}
	}
}