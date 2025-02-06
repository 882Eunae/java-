package com.yedam.api;

import java.util.Iterator;

public class TimeExe {
	public static void main(String[] args) {
		// ? 시간 ?분 ?초 합은 ? 입니다 출력
		// 1부터 10000x1000000(백억) 까지 짝수합을 구하는 시간.
		long sum = 0;
		long time1, time2=0;
		 time1 = System.currentTimeMillis(); //현재시간 
		System.out.println(time1);
		
		long n = 2147483648L;
		System.out.println(Integer.MAX_VALUE);// 2147483647
		System.out.println(Long.MAX_VALUE);// 9223372036854775807
		
		for (long i = 1; i < 100000000; i++) {
			if (i % 250== 0) {
				sum += i;
			}
		} // end of for

		 time2 = System.currentTimeMillis();
		long jobTime=(time2-time1) /1000; 
		long min=jobTime/60;
		long sec=jobTime%60; 
		
		System.out.println("1~1000000까지의 합:" + sum);
		System.out.printf("%d분 %d초, 합:%d\n",min,sec,sum);

	}
	
	void test() {
		
	}
	
}
