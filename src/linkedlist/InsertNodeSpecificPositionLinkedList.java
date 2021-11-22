package linkedlist;

import java.util.Scanner;

public class InsertNodeSpecificPositionLinkedList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int tamanhoDaLista = in.nextInt();
		LinkedList linkedList = new LinkedList();

		// O(1)
		for (int i = 0; i < tamanhoDaLista; i++) {
			linkedList.adicionar(in.nextInt());
		}

		int valor = in.nextInt(), posicao = in.nextInt();

		Node insertNodeAtPosition = insertNodeAtPosition(linkedList.getPrimeiro(), valor, posicao);

		while (insertNodeAtPosition != null) {
			System.out.print(insertNodeAtPosition.getValor());

			insertNodeAtPosition = insertNodeAtPosition.getProximo();

			if (insertNodeAtPosition != null) {
				System.out.print(" ");
			}
		}

		in.close();
	}

	static Node insertNodeAtPosition(Node head, int valor, int posicao) {
		
		if (head == null)
			return null;
		
		Node novoValor = new Node(valor);
		if (posicao == 0) {
			novoValor.setProximo(head);
			return novoValor;
		}
		
		Node p = head;
		for (int i = 0; i < posicao - 1; i++) {
			p = p.getProximo();
		}
		
		Node next = p.getProximo();
		p.setProximo(novoValor);
		novoValor.setProximo(next);

		return head;

	}

}

class LinkedList {

	private Node primeiro;
	private Node ultimo;
	private int tamanho;

	public LinkedList() {
		this.tamanho = 0;
	}

	void adicionar(int novoValor) {
		Node novoElemento = new Node(novoValor);

		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		} else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}

		tamanho++;
	}

	Node get(int posicao) {
		Node atual = this.primeiro;

		for (int i = 0; i < posicao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}

	public Node getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Node primeiro) {
		this.primeiro = primeiro;
	}

	public Node getUltimo() {
		return ultimo;
	}

	public void setUltimo(Node ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
}

class Node {
	private Node proximo;
	private int valor;

	public Node(int valor) {
		this.valor = valor;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
}
