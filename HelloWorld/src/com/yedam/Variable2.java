package com.yedam;

public class Variable2 {
 public static void main(String[] args ) {
	 	 
	 for(int j=1; j<=9; j++) {
	 	int num=j;  
	 	for(int i= 2; i <= 6; i++) {
	 		System.out.printf("%d * %d =  %2d ",i,j,i*j);
//	 		System.out.printf("%1$d * %2$d = %3$d\n", num,i,num*i); // `${i} * ${num} = ${num*i}`
	 	}
	 	System.out.println(" ");
	 } //end of for 
	 	System.out.println("end of prog");
 }
}
