package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PDV {

	public static void main(String[] args) {
		// Variáveis
		double total, desconto, totalDesconto, valorPago, troco;
		// Objetos
		Scanner teclado = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.00");
		// Entrada 1
		System.out.println("PDV");
		System.out.print("Valor total: ");
		total = teclado.nextDouble();
		System.out.print("Desconto(%): ");
		desconto = teclado.nextDouble();
		// Processamento
		totalDesconto = total - (desconto * total) / 100;
		// Saída 1
		System.out.println("Total de desconto: R$ " + formatador.format(totalDesconto));
		
		//Entrada 2
		System.out.println("________________________________");
		System.out.print("Valor pago em dinheiro: ");
		valorPago = teclado.nextDouble();
		//Processamento 2
		troco = valorPago - totalDesconto;
		//Saída 2
		System.out.println("Troco: R$ " + formatador.format(troco));
		teclado.close();
	}

}
