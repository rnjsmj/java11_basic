package org.kh.app;

public class Condition5 {

	public static void main(String[] args) {
		String remark = "";
		int rank = 1;
		
		switch(rank) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				remark = "우등상"; break;
			default : remark = "일반";
		}
	}

}
