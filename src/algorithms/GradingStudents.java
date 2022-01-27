package algorithms;

import java.io.IOException;
import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		int [] vetor = gradingStudents(arr);
		
		for(int j : vetor) {
			System.out.println(j);
		}

		in.close();
	}

	public static int[] gradingStudents(int[] grades) {
		int[] novoArr = new int[grades.length];

		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 38 || grades[i] % 5 <= 2) {
				novoArr[i] = grades[i];
			} else if (grades[i] % 5 > 2) {
				int add = 5 - (grades[i] % 5);
				novoArr[i] = grades[i] + add;
			}
		}

		return novoArr;

	}

}
