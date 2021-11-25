package arrays;

import java.io.IOException;
import java.util.Scanner;

/*Parâmetros: System.arraycopy ()
 source_arr : array a ser copiado de
 sourcePos : posição inicial no array de origem de onde copiar
 dest_arr : array a ser copiado em
 destPos : posição inicial no array de destino, onde copiar em
 len : total no. de componentes a serem copiados.*/

public class ArraysLeftRotation {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int tamanho = in.nextInt(), desloca = in.nextInt();
		int[] arr = new int[tamanho];
 		
		for(int i=0; i<tamanho; i++) {
			arr[i] = in.nextInt();
		}
		
		int[] result = rotLeft(arr, desloca);
		
		for(int i : result) {
			System.out.print(i + " ");
		}
		
		in.close();
	}

	public static int[] rotLeft(int[] arr, int b) {
		int n = arr.length;
		int[] rotacionados = new int[n];
		
		System.arraycopy(arr, b, rotacionados, 0, n-b);
		System.arraycopy(arr, 0, rotacionados, n-b, b);
		
		return rotacionados;

	}

}
