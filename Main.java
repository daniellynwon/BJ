package yuna;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// 빠른 A+B bufferedReader, Writer 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine().trim());
		
		for(int i=0; i<num; i++) {
			String str = br.readLine();
			String[] txt = str.split(" ");		// 공백을 기준으로 string 짜름.
			// 자른 string을 a,b로 나눠서 대입
			int a = Integer.parseInt(txt[0]);
			int b = Integer.parseInt(txt[1]);
			bw.write((a+b)+"\n");
		}
		bw.flush();
		bw.close();
		
	}
}