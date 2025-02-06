package com.yedam.api;

public class StringUtil {

	static void checkgender(String ssn) {
		char sex = ' ';
		if (ssn.indexOf("-") != -1) {
			sex = ssn.charAt(7);

		} else if (ssn.indexOf(" ") != -1) {

			sex = ssn.charAt(7);
		} else {
			sex = ssn.charAt(6);
		}
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
	}

	static void checkExtension(String ssn) {
		String[] ss = ssn.split("[.]"); 
		String last=ss[ss.length-1]; 
		System.out.println("정답:"+"파일의 확장자 명은" + last+ "입니다");
	}

	static void getLength(String str) {
		// 문자으이 길이는 7글자 입니다
		int length = str.trim().length();
		System.out.println("문장의 길이는" + length + "글자 입니다");
	}

	static void 연결하기(String str, String str1) {
		String result = str.concat("").concat(str1);
		System.out.println(result);
	}

}// end of stringutil
