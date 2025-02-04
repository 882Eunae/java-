package com.yedam.Inheritance;

/*
 * Friend 상속하는 ComFriend
 * 회사명,부서정보
 */

public class ComFriend extends Friend {
	private String companyName; 
	private String department; 
	//생성자
	public ComFriend(String friendName,String phoneNumber,String companyName,String department) {
		//부모 클래스 원래 생성자 역할을 그대로함 super 부모  
		super(friendName,phoneNumber); 
		this.companyName=companyName;
		this.department=department;
		
	}
	//getter,setter 
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String showlist() {

		return super.showlist()+",회사: "+companyName;
		
	}
	
	
	
}
