package com.yedam.exception;

import com.yedam.reference.Student;

public class NullPointerExe {
	public static void main(String[] args) {

		Student student = null;
		String[] strAry = { "Hello", "World" };
		// 예외처리.
		try {
			int menu = Integer.parseInt("a");
			strAry[2] = "Nice"; // 배열의 범위
			System.out.println(student.getStudentName());
		}
//	} catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
		catch (NullPointerException e) {
			System.out.println("null값을 참조또는 배열범위 초과");
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			System.out.println("NumberFormat 예외발생.");
		} catch (RuntimeException e) {
			System.out.println("상위exception은 하위exception 처리 ");
		} catch (Exception e) {
			e.printStackTrace(); // 정확하게 프로그램이 작동되긴 하지만 에러메시지 정확하게 보여줌
		}

		System.out.println("end of prog");

	}
}
