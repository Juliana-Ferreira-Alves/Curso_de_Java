package array;

public class ArrayM {

	public static void main(String[] args) {
		String[][] agenda = {{"Juliana","9999-9999", "teste@teste.com" }, {"Edu","9999-8888", "teste2@teste.com"}, {"JP","9999-7777", "teste3@teste.com"}};	
		//A linha abaixo recupera o telefone da Juliana
		//System.out.println(agenda[0][1]);
		
		//As estrutura abaixo percorrer as estruturas dos índices
		for (int i = 0; i < agenda.length; i++) {
			System.out.println("____________________________");
			for (int j = 0; j < agenda.length; j++) {
				System.out.println(agenda [i][j]);
			}
		}
	}

}
