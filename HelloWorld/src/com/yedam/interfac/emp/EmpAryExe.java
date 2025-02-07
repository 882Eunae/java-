package com.yedam.interfac.emp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/*
 * 배열활용
 */
public class EmpAryExe implements EmpDAO {

	Employee[] employees = new Employee[100];

	public EmpAryExe() {

		employees[0] = new Employee(1001, "홍기영", "432-1234");
		employees[1] = new Employee(1002, "박기영", "432-1234");
		employees[2] = new Employee(1003, "김길동", "432-1234");
		employees[3] = new Employee(1004, "정길동", "432-1234");
		employees[4] = new Employee(1005, "박사장", "432-1234");
	}

	// case1
	@Override
	public boolean registerEMP(Employee emp) {

		for (int i = 0; i < employees.length; i++) {
			//빈공간에 추가 
			if (employees[i] == null) {
				employees[i] = emp;
				return true;
			}
		}
		return false; //등록실패 
	}

	// case 3
	@Override
	public boolean removeEMP(int num) {

		for (int i = 0; i < employees.length; i++) {

			if (employees[i].getNum() == num && employees[i] != null) {

				employees[i] = null;

				return true;
			}

		}

		return false;
	}

	@Override
	public List<Employee> search(Employee emp) {
		List<Employee>search=new ArrayList<Employee>();
		int salary = emp.getMoney(); // 급여조건으로함
		int idx = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i] != null && employees[i].getName().indexOf(emp.getName())!=-1) {
				search.add(employees[i]);
				idx++;
			}
		}//end of for 
		return search;
	}

	@Override
	public boolean modifyEmp(Employee emp) {

		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd"); 
		for (int i = 0; i < employees.length; i++) {

			if (employees[i].getNum() == emp.getNum()&& employees[i]!=null)
					 {
				//연락처값이 ""이 아닐때 변경 
				if(!emp.getTel().equals("")) {
				employees[i].setTel(emp.getTel());
				}
				try {
					//값을 변경안하려고 엔터("")일 경우 1900-01-01  
					if(emp.getDate().equals(sdf.parse("1900-01-01"))) {
					employees[i].setDate(emp.getDate());
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				if(emp.getMoney()!=0) {
				employees[i].setMoney(emp.getMoney());
				}
				return true; // 정상수정.
			}
		}
		return false; // 수정못함.

}}
