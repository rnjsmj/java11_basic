package exam;

public class Exam3 {

	public static void main(String[] args) {
		// Q3
		int[] arr = new int[5];
		
		int cnt = 0;
		for (int i=1; i<=10; i++) {
			if(i%2==0) {
				arr[cnt] = i;
				cnt++;
			}
		}
		
		int tot=0;
		for (int i =0; i<arr.length; i++) {
			tot += arr[i];
		}
		
		System.out.println(tot);

	}

}
