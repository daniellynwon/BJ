package yuna;

// ���� 11021��
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷� �ۼ�.
		// ù�� �ٿ� �׽�Ʈ ���̽� ���� T�� �־���.
		// 0<A, B<10
		// �׽�Ʈ ���̽����� 'Case #x: '���
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