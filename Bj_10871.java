package yuna;

// ���� 10871�� X���� ���� ��
import java.util.Scanner;

public class Bj_10871 {
	public static void main(String[] args) {
		// ù° �ٿ� N�� X. (1<=N, X<=10,000)
		// ��° �ٿ� ���� A�� �̷�� ���� N��
		// X���� ���� ���� �Է¹��� ������� �������� ������ ���. X���� ���� �� at least �ϳ� ����.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		// N �Է°�.
		int x = sc.nextInt();		// X �Է°�.
		
		int[] arr = new int [n];
		// for�� ����Ͽ� �Էµ� �� �迭�� �ֱ�.
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();		// �Էµ� �� �迭�� ����.
			// �Է¹��� �� �� X���� ���� ���� �Է¹��� ������� ���.
			if(arr[i]<x) {
				System.out.print(arr[i]+" ");
			}
		}
				
	}
}