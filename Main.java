package yuna;

// ���� 11022��
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷� �ۼ�.
		// ù�� �ٿ� �׽�Ʈ ���̽� ���� T�� �־���.
		// 0<A, B<10
		// �׽�Ʈ ���̽����� 'Case #x: A + B = C ' �������� ���
		int arr1[][];
		int arr2[];
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();		// �׽�Ʈ ���̽� ���� �ޱ�.
		arr1 = new int[t][t];		// a�� b ���� �迭
		arr2 = new int[t];		// �׽�Ʈ ���̽���ŭ ���� ���� �迭.
		for(int i=0; i<t; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr1[i][0] = a;
			arr1[i][1] = b;
			arr2[i] = (a+b);		// �迭�� A,B ���� �� �ֱ�.
		}
		for(int i=0; i<t;i++) {
			System.out.println("Case #"+(i+1)+": "+arr1[i][0]+" + "+arr1[i][1]+" = "+arr2[i]);			
		}
	}
}