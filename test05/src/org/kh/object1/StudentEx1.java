package org.kh.object1;

public class StudentEx1 {

	public static void main(String[] args) {
		Student st = new Student();
		st.resulting();
		
		st.name = "권민지";
		st.resulting();
		
		st.kor = 80;
		st.eng = 75;
		st.mat = 90;
		st.resulting();

	}

}
