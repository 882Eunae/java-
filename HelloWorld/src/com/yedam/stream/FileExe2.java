package com.yedam.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileExe2 {
	public static void main(String[] args) {
		// 보조스트림(입출력스트림)
		try {
			Reader reader = new FileReader("c:/temp/student.txt");

			BufferedReader br = new BufferedReader(reader);

			while (true) {
				
				String str = br.readLine();// 한라인씩 읽기
				if (str == null) {
					break;
				}
				String[] strAry = str.split(" ");
				System.out.println("이름: " + strAry[0] + ",영어:" + strAry[1] + ",수학" + strAry[2]);
			}

			br.close();
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
