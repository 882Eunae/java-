package com.yedam.interfac.emp;
/*
 * EmpDAO(인터페이스) 구현하는 클래스. 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDBExe implements EmpDAO{
	Connection getConnect() throws SQLException {
	String url="jdbc:oracle:thin:@localhost:1521:xe"; //오라클 디비 접속정보.
	String user="hr"; 
	String password="hr"; 
	Connection conn=null; 
	//커넥션 객체 만들기 
	try {
		 conn=
				 DriverManager.getConnection(url,user,password);
	} catch(SQLClientInfoException e) {
		e.printStackTrace();
	} return conn; 
	}
	@Override
	public boolean registerEMP(Employee emp) {
		
		String query="insert into tbl_employees ";
		query+="values ("+emp.getNum()+", "+emp.getName()
											+" ,"+emp.getTel()
											+", "+emp.getDate()
											+", "+emp.getMoney()
											+")"; 
		try {
			Statement stmt=getConnect().createStatement();
			int r=stmt.executeUpdate(query);
			if(r>0) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean removeEMP(int num) {
		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		
		List<Employee> empList=new ArrayList<>(); 
		try {
			Statement stmt=getConnect().createStatement();
			ResultSet rs=stmt.executeQuery("select * from tbl_employees");
			//조회결과
			while(rs.next()) {
				Employee empl=new Employee();
				empl.setNum(rs.getInt("emp_no"));
				empl.setName(rs.getString("emp_name"));
				empl.setDate(rs.getDate("hire_date"));
				empl.setMoney(rs.getInt("salary"));
				empl.setTel(rs.getString("tel_no"));
				
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return empList;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		return false;
	}

}
