package sec2;

public class ArrayCopy2 {

	public static void main(String[] args) {
		int[] arr1 = {80, 70, 65, 90, 85, 95, 60};
		int[] arr2 = {5, 3, 8, 7, 6, 4, 2};
		int[] arr3 = {5, 3, 8, 7, 6, 4, 2};
		
		System.out.println("arr1:" + arr1);
		System.out.println("arr2:" + arr2);
		System.out.println("arr3:" + arr3);
		
		//깊은 복제 => 주소 다르게 데이터만 복사
		for (int i=0; i<arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		for (int i=0; i<arr3.length; i++) {
			System.out.println(i + " : " + arr3[i]);
		}
		System.out.println("arr1:" + arr1);
		System.out.println("arr2:" + arr2);
		System.out.println("arr3:" + arr3);
		
		System.arraycopy(arr2, 0, arr1, 0, arr1.length);
		for (int i=0; i<arr1.length; i++) {
			System.out.println(i + " : " + arr1[i]);
		}
		System.out.println("arr1:" + arr1);
		System.out.println("arr2:" + arr2);
		System.out.println("arr3:" + arr3);
		
		
		
		

	}

}
