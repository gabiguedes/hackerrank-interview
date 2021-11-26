package dictionariesandhashmaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTablesRansomNote {

	Map<String, Integer> magazineMap;
	Map<String, Integer> noteMap;

	public HashTablesRansomNote(String magazine, String note) {
	        this.noteMap = new HashMap<String, Integer>();
	        this.magazineMap = new HashMap<String, Integer>();
	        
	        // Deve usar um objeto em vez de um primitivo porque pode receber uma referência nula. 
	        Integer ocorrencias;
	        //Regex para separar cada palavra do dicionario 
	        //Exemplo: [two, times, three, is, not, four]
	        for(String s : magazine.split("[^a-zA-Z]+")) {
	            ocorrencias = magazineMap.get(s);
	            
	            if(ocorrencias == null) {
	                magazineMap.put(s, 1);
	            }
	            else {
	                magazineMap.put(s, ocorrencias + 1);
	            }
	        }
	        
	        for(String s : note.split("[^a-zA-Z]+")) {
	            ocorrencias = noteMap.get(s);
	            
	            if(ocorrencias == null) {
	                noteMap.put(s, 1);
	            }
	            else {
	                noteMap.put(s, ocorrencias + 1);
	            }
	        }
	        
	    }

	public void solve() {
		boolean canReplicate = true;
		for (String s : noteMap.keySet()) {
			if (!magazineMap.containsKey(s) || (magazineMap.get(s) < noteMap.get(s))) {
				canReplicate = false;
				break;
			}
		}

		System.out.println((canReplicate) ? "Yes" : "No");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();

		// Coma o espaço em branco até o início do próximo 
		scanner.nextLine();

		HashTablesRansomNote s = new HashTablesRansomNote(scanner.nextLine(), scanner.nextLine());
		scanner.close();

		s.solve();
	}

}
