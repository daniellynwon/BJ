package yuna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// ���� A+B bufferedReader, Writer ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine().trim());
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			String[] txt = str.split(" ");		// ������ �������� string ¥��.
			// �ڸ� string�� a,b�� ������ ����
			int a = Integer.parseInt(txt[0]);
			int b = Integer.parseInt(txt[1]);
			bw.write((a+b)+"\n");
		}
		bw.flush();
		bw.close();
		
	}
}