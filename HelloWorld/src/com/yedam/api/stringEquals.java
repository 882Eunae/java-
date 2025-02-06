package com.yedam.api;

import java.io.UnsupportedEncodingException;

public class stringEquals {
	 public static void main(String[] args) {
//		String strVar1=new String("신민철"); 
//		String strVar2="신민철"; 
//		
//		if(strVar1.equals(strVar2)) {
//			System.out.println("같은 문자열을 가짐");
//		}else {
//			System.out.println("다른 문자열을 가짐");
//		}
		 
		 String str="안녕하세요"; 
		 byte[] bytes1=str.getBytes(); 
		 String str1=new String(bytes1); 
		 System.out.println(str1);
		 
		 try {
			 
			 byte[] bytes2=str.getBytes("EUC-KR");
			 String str2=new String(bytes2,"EUC-KR");
					System.out.println(str2); 
			 
		 }catch(UnsupportedEncodingException e) {
			 e.printStackTrace();
		 }
		 
		 
		
		
		
	}
}
