package dictionariesandhashmaps;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class SherlockAndAnagrams {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(System.out));

		int q = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, q).forEach(qItr -> {
			try {
				String s = bufferedReader.readLine();

				int result = sherlockAndAnagrams(s);

				bufferedWriter.write(String.valueOf(result));
				bufferedWriter.newLine();
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
		bufferedWriter.close();
	}

	public static int sherlockAndAnagrams(String s) {
		Map<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			for(int j=i; j<s.length(); j++) {
				char[] c = s.substring(i, j+1).toCharArray();
				Arrays.sort(c);
				String k = new String(c);
				
				if(map.containsKey(k)) {
					map.put(k, map.get(k) +1);
				}else {
					map.put(k, 1);
				}
			}
		}
		
		int paresAnagramas = 0;
		
		for(String k : map.keySet()) {
			int v = map.get(k);
			//combinatoria
			paresAnagramas += (v*(v-1))/2;
		}
		
		return paresAnagramas;

	}

}
