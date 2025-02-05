package com.yedam.interfac.emp;
/*
 * 컬렉션활용.
 *  
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import com.yedam.reference.Student;

public class EmpListExe implements EmpDAO {
	//필드 
	List<Employee> employees = new ArrayList<Employee>();
	
	//생성자 
	public EmpListExe() {
		//초기값 
		employees.add(new Employee(1001,"홍기영","432-1234"));
		employees.add(new Employee(1002,"박기영","432-1234"));
		employees.add(new Employee(1003,"김길동","432-1234"));
		employees.add(new Employee(1021,"정길동","432-1234"));
		employees.add(new Employee(1010,"박사장","333-1212","2000-01-01",500));
		
	}

	@Override
	public boolean registerEMP(Employee emp) {

		return employees.add(emp);

		// add가 잘되면 true 값반환 add 메소드 자체가 반환을 해줌

	}// end of registerEMP

	@Override
	public boolean removeEMP(int num) {

		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getNum() == num) {
				// students[i]
				employees.remove(i);
				return true;

			} // if 문
		} // end of for

		return false;
	}// end of 삭제
	
	//case4
	@Override
	public Employee[] search(Employee emp) {

		Employee[] search=new Employee[10];
		int idx = 0;
		int salary=emp.getMoney();
		
		for (int i = 0; i < employees.size(); i++) {
			if (employees.get(i).getName().indexOf(emp.getName())!=-1) {
				search[idx]=employees.get(i);
				idx++; 	
			}
		}//end of for 
		
		return search;
	}//end of search 

	@Override
	public boolean modifyEmp(Employee emp) {
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
		for (int i = 0; i < employees.size(); i++) {

			if (employees.get(i).getNum() == emp.getNum()) {
				//연락처값이 ""이 아닐때 변경 
				if(!emp.getTel().equals("")) {
				employees.get(i).setTel(emp.getTel());
				}
				try {
					//값을 변경안하려고 엔터("")일 경우 1900-01-01  
					if(emp.getDate().equals(sdf.parse("1900-01-01"))) {
					employees.get(i).setDate(emp.getDate());
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				if(emp.getMoney()!=0) {
				employees.get(i).setMoney(emp.getMoney());
				}
				return true; // 정상수정.
			}
		}
		return false; // 수정못함.
	}

}
