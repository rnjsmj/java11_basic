package sec2;

public class ArrayCopy1 {

	public static void main(String[] args) {
		int[] arr1 = {80, 70, 65, 90, 85, 95, 60};
		int[] arr2 = {5, 3, 8, 7, 6, 4, 2};
		int[] arr3;
		
		System.out.println(arr1);
		System.out.println(arr2);
//		System.out.println(arr3);
		
		//arr2에 arr1을 복사하여 대입 
		//얕은 복사
		arr2 = arr1;
		arr3 = arr1;
		for (int i=0; i<arr2.length; i++) {
			System.out.println(i+" : " + arr2[i]);
		}
		
		System.out.println("arr1 : "+ arr1);
		System.out.println("arr2 : "+ arr2);
		System.out.println("arr3 : "+ arr3);
		
		arr1[2] = 75;
		for (int i=0; i<arr1.length; i++) {
			System.out.println(i+" : " + arr1[i]);
		}
		for (int i=0; i<arr2.length; i++) {
			System.out.println(i+" : " + arr2[i]);
		}
		for (int i=0; i<arr3.length; i++) {
			System.out.println(i+" : " + arr3[i]);
		}

	}

}
