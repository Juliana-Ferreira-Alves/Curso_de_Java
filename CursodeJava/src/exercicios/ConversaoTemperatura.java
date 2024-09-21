package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		// Variáveis
		double c, f;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0");
		// Entrada de dados
		System.out.println("Conversão da temperatura");
		System.out.println("Digite a temperatura em fahrenheit: ");
		f = teclado.nextDouble();
		// Processamento
		c = (5 * (f - 32)) / 9;
		// Saída
		System.out.println("Temperatura em Celsius: " + formatador.format(c) + "�C");
		teclado.close();

	}

}
