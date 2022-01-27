package algorithms;

public class AppleAndOrange {

	public static void main(String[] args) {

		int[] arr = { 10, 12, 2, 4 };
		

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				int nno[] = {arr[i] + arr[j]};
				
				for(int k : nno) {
					System.out.println(k);
				}
			}
		}

	}

}
