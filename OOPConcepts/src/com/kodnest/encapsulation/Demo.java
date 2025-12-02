package com.kodnest.encapsulation;

public class Demo {
	private int pageNo;
	static int defaultPageNo = 0;
	
	//setters
	public void setPageNo(int x) {
		if(x>0) {
		pageNo = x;
		} else {
			pageNo = defaultPageNo++;
		}
	}
	
	//getters
	public int getPageNo() {
		return pageNo;
	}
}
