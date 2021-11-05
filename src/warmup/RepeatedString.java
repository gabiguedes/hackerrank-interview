package warmup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
    	long t = n / s.length();
    	int restante = (int) (n % s.length());
    	long encontrado = 0;
    	
    	for(char c : s.toCharArray()) {
    		if(c == 'a')
    			encontrado++;
    	}
    	
    	long total = encontrado * t;
    	
    	if(restante == 0)
    		return total;
    	else {
    		String parte = s.substring(0, restante);
    		for(char ch : parte.toCharArray()) {
    			if(ch == 'a') 
    				total++;
    		}
    	}
    	
    	return total;
    }

}

public class RepeatedString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(System.out));

        String s = bufferedReader.readLine();

        long n = Long.parseLong(bufferedReader.readLine().trim());

        long result = Result.repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
