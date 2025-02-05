package com.yedam.interfac.emp;
/*
 * 배열활용
 */
public class EmpAryExe implements EmpDAO {
	
	Employee [] employees=new Employee[100];
	
   public EmpAryExe() {
	   
	   employees[0]=new Employee(1001,"홍기영","432-1234");
	   employees[1]=new Employee(1002,"박기영","432-1234");
	   employees[2]=new Employee(1003,"김길동","432-1234");
	   employees[3]=new Employee(1004,"정길동","432-1234");
	   employees[4]=new Employee(1005,"박사장","432-1234");
   }
	
	@Override
	public boolean registerEMP(Employee emp) {
		
	    for(int i=0; i<employees.length; i++) {
	    	
	    	if(employees[i] ==null) {
	    		employees[i]=emp;
	    		return true;
	    	}
	    }
		return false;
	}

	@Override
	public boolean removeEMP(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee[] search(Employee emp) {
		Employee[] search=new Employee[10];
		int salary=emp.getMoney(); //급여조건으로함 
		int idx=0;
		for(int i=0; i<employees.length; i++) {
			if(employees[i]!=null && employees[i].getMoney()>salary ) {
				search[idx]=employees[i];
				idx++; 
			}
		}
		return search;
	}

	@Override
	public boolean modifyEmp(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
