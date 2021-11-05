package arrays;

import java.util.Scanner;

public class Array2DDS {

	private static final Scanner in = new Scanner(System.in);

	public static void main(String[] matata) {
		int[][] arr = new int[6][6];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = in.nextInt();
			}
		}

		int resultado = Solver.somaAmpulhetas(arr);
		System.out.println(resultado);
	}

}

class Solver {

	static int somaAmpulhetas(int[][] arr) {
		int res = -63, tmp = 0;

		for (int i = 0; i < arr.length - 2; i++) {
			for (int j = 0; j < arr[i].length - 2; j++) {
				tmp = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				if (tmp > res) {
					res = tmp;
				}
			}
		}

		return res;
	}
}
