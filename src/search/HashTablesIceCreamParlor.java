package search;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTablesIceCreamParlor {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();

		for (int k = 0; k < t; k++) {
			int money = in.nextInt();
			int n = in.nextInt();
			int[] cost = new int[n];

			for (int i = 0; i < cost.length; i++) {
				cost[i] = in.nextInt();
			}

			whatFlavors(cost, money);
		}

		in.close();
	}

	public static void whatFlavors(int[] cost, int money) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < cost.length; i++) {
			if (cost[i] < money) {
				if (map.containsKey(money - cost[i])) {
					int index = map.get(money - cost[i]);
					System.out.println((index + 1) + " " + (i + 1));
					return;
				}
				
				if(!map.containsKey(cost[i])) {
					map.put(cost[i], i);
				}
			}
		}

	}

}
