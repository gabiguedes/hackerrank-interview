package warmup;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SalesByMatch {
	
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int limite = in.nextInt();
		int[] integers = new int[limite];
		Set<Integer> cores = new HashSet<>();
		int pares = 0;

		//O(n) linear
		for (int i = 0; i < limite; i++) {
			int x = in.nextInt();
			integers[i] = x;
		}
		
		for (int j = 0; j < limite; j++) {
			//A chamada para contains() nas cores será O(1) para um HashSet versus O(n) para uma Lista
			if(!cores.contains(integers[j])) {
				cores.add(integers[j]);
			} else {
				pares++;
				cores.remove(integers[j]);
			}
		}
		
		System.out.println(pares);

		in.close();
	}

}
