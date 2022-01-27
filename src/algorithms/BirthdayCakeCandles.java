package algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
		}

		System.out.println(birthdayCakeCandles(arr));

		in.close();
	}

	public static int birthdayCakeCandles(int[] candles) {
		int contador = 0;
		int[] copyCandles = candles.clone();
		Arrays.sort(candles);
		
		int getUltimaPosicao = candles[candles.length-1];
		
		for(int i=0; i <candles.length; i++) {
			if(getUltimaPosicao == copyCandles[i]) {
				contador++;
			}
		}
		
		return contador;

	}

}
