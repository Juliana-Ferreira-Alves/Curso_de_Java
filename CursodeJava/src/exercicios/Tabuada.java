package exercicios;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// Estrutura de repetição
		// for (int i= 0; i <6; i++)
		// inicio i=0
		// fim<10
		// i++ i = i+1

		// Variável
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o valor da tabuada: ");
		valor = teclado.nextInt();

		for (int i = 0; i <= 10; i++) {
			System.out.println(valor + " X " + i + " = " + (valor * i));
		}
		teclado.close();

	}

}
