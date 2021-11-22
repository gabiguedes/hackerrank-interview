package dictionariesandhashmaps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.stream.IntStream;

public class TwoStrings {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(System.out));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String s1 = bufferedReader.readLine();

				String s2 = bufferedReader.readLine();

				String result = twoStrings(s1, s2);

				bufferedWriter.write(result);
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static String twoStrings(String s1, String s2) {
		HashSet<Character> hs = new HashSet<>();
		
		for (char c : s1.toCharArray()) {
			hs.add(c);
		}
		
		for (char c : s2.toCharArray()) {
			if (hs.contains(c)) {
				return "YES";
			}
		}
		return "NO";
	}

}
