package org.kh.java;

public class Variable7 {

	public static void main(String[] args) {
		String name = "권민지";
		Integer age = 24; // int /= Integer(Class)
		Float height = 161.7f;
		//boolean pass = true;
		Double weight = 65.0;
	
		System.out.println("name : " + name.getClass().getName());
		System.out.println("age : " + age.getClass().getName());
		System.out.println("height : " + height.getClass().getName());
		System.out.println("weight : " + weight.getClass().getName());
		
		String age2 = "24";
		int age3 = Integer.parseInt(age2);
		System.out.println("age : "+age3);
		
		String height2 = "161.7";
		float height3 = Float.parseFloat(height2);
		System.out.println("height : "+height3);
		
		//primitive type => Wrapper type : boxing
		//Wrapper type => primitive type : unboxing
	}

}
