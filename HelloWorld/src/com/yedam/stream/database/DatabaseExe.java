package com.yedam.stream.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExe {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe"; //오라클 디비 접속정보.
		String user="hr"; 
		String password="hr"; 
		//커넥션 객체 만들기 
		try {
			Connection conn=DriverManager.getConnection(url,user,password);
			System.out.println("연결성공");
			//tbl_student 테이블의 조회 
			Statement stmt=conn.createStatement();
			//stmt.executeUpdate("insert into tbl_student (student_no,student_name) values('S007','박현수')");
			String query= "delete from tbl_student "
					  +"where student_name='박현수' "; 
			int r=stmt.executeUpdate(query);
			
			if(r>0) {
				System.out.println("수정완료.");
			}
			ResultSet rs=stmt.executeQuery("select * from tbl_student"); //조회쿼리
			//반복문활용. 
			while(rs.next()) { //조회결과 true, 마지막데이터 false. 
				//컬럼명 
				System.out.println(rs.getString("student_no")
								+" "+rs.getString("student_name")
								+" "+rs.getString("phone")
								+" "+rs.getString("address"));
			}
			System.out.println("end of data");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("end of prog");
	}//end of main
	
}
