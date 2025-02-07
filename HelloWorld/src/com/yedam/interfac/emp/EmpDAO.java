package com.yedam.interfac.emp;

import java.util.List;

public interface EmpDAO {

//등록 	
public boolean registerEMP(Employee emp);
//삭제
public boolean removeEMP(int num); 
//조회 
public List<Employee> search(Employee emp); 
//수정
public boolean modifyEmp(Employee emp);

}
