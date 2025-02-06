package com.yedam.api;

public class Member {
	String memberId;
	int memPoint;

	Member() {// 기본생성자
	} 

	Member(String id, int point) {
		memberId = id;
		memPoint = point;
	}

	@Override
	public int hashCode() {
		// return super.hashCode(); //Object의 Hashcode는 주소값
		return memPoint;
	}

	public boolean equals(Object obj) {
		// memberId 같을경우... 논리적으로 같은 객체.
		if (obj instanceof Member) {
			Member m2 = (Member) obj;
			if (this.memberId == m2.memberId && this.memPoint == m2.memPoint) {
				return true;
			}
		}
		;
		return false;
	}// end of equals

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memPoint=" + memPoint + "]";
	}
	
	

}
