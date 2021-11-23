package stringmanipulation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.stream.IntStream;

public class AlternatingCharacters {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(System.out));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String s = bufferedReader.readLine();

				int result = alternatingCharacters(s);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static int alternatingCharacters(String s) {
		int ans =0;
		
		for(int i=0; i<s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				ans++;
			}
		}
		
		return ans;

	}

}
