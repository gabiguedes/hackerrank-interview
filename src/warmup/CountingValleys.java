package warmup;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
	
	public static void main(String[] args) throws IOException {
		 Scanner in = new Scanner(System.in);
		 int steps = in.nextInt(), nivelDoMar = 0, vale = 0;
		 char[] c = in.next().toCharArray();
		 
		 for(char l : c) {
			 if(l == 'U') ++nivelDoMar;
			 if(l == 'D') --nivelDoMar;
			 
			 if(nivelDoMar == 0 && l == 'U') ++vale;
			 
		 }
		 System.out.println(vale);
		 in.close();
	}

}
