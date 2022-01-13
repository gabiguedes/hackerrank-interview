package algorithms;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MiniMaxSum {

	public static void main(String[] args) throws IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt).collect(toList());

		int[] numbers = new int[arr.size()];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = arr.get(i);
		}

		miniMaxSum(numbers);

		bufferedReader.close();

	}

	public static void miniMaxSum(int[] arr) {
		long x = 0, y = 0;

		//Classifique a matriz
		Arrays.sort(arr);
		
		//Soma tudo, menos o último item (agora você tem a mini soma)
		for (int i = 0; i < arr.length - 1; i++) {
			x += arr[i];
		}
		
		//Soma tudo, menos o primeiro item (agora você tem a soma máxima)
		for (int i = 1; i < arr.length; i++) {
			y += arr[i];
		}
		
		System.out.println(x + " " + y);

	}

}
