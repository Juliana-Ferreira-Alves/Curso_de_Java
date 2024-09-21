package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ValorPorcentagem {

	public static void main(String[] args) {
		// Variáveis
		double x, y, valor;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entranda
		System.out.println("Valor da Porcentagem");
		System.out.println("x% de y = valor");
		System.out.println("Digite o valor de x: ");
		x = teclado.nextDouble();
		System.out.println("Digite o valor de y: ");
		y = teclado.nextDouble();
		// Processamento
		valor = (x * y) / 100;
		// Saída
		System.out.println(x + "% de " + y + " = " + formatador.format(valor));
		teclado.close();

	}

}

		//shift + alt + y -> Faz quebra de linha
		//ctrl + shit + f -> Formata o código
