package review_0205;

public interface comDAO {

//등록 
public boolean registCOM(company com);
//삭제 
public boolean removeCOM(int num); 
//조회
public company[] search(company com); 
//수정
public boolean modifyCOM(company com); 	
	
}
