package exercicios;

import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		//Variáveis
		double alcool, gasolina;
		Scanner teclado = new Scanner(System.in);
		/// Entrada
		System.out.println("Álcool x Gasolina");
		System.out.print("Digite o valor do Álcool: ");
		alcool = teclado.nextDouble();
		System.out.print("Digite o valor da Gasolina: ");
		gasolina = teclado.nextDouble();
		// Processamento
		if (alcool < 0.7 * gasolina) {
			System.out.println("Abastecer com Álcool");
		} else {
			System.out.println("Abastecer com Gasolina");
		}
		teclado.close();

	}

}
