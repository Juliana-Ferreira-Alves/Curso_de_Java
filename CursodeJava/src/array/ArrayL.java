package array;

import java.util.ArrayList;

public class ArrayL {

	public static void main(String[] args) {
		ArrayList<String> contatos = new ArrayList<>();
		contatos.add("Juliana Alves");
		contatos.add("9999-9999");
		contatos.add("teste@email.com");
		contatos.add("Eduardo Alves");
		contatos.add("9999-8888");
		contatos.add("teste2@email.com");
		System.out.println("Tamanho do array: " + contatos.size());
		System.err.println(contatos);
		System.out.println("E-mail Juliana Alves (Índice[2]) " + contatos.get(2));
		System.out.println("_______________________");
		for (int i = 0; i < contatos.size(); i++) {
			System.out.println(contatos.get(i));
			
		}

	}

}
