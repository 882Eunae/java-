package com.yedam.Inheritance;
/*
 * Data Access Object 
 * 추상클래스 규칙.
 * mysqlDao -> register ,remove ,search
 *  oracleDao -> register ,remove ,search
 */
public abstract class Dao {
	//등록 
	
	public abstract void register();
	
	public abstract void remove();
	
	public abstract void search();
}
