package array;

public class Jogo_de_Carta {

	public static void main(String[] args) {
		String[] nipes = { "Ouros", "Copas", "Espadas", "Paus" };
		String[] faces = { "Az", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "REi" };
		String nipe = nipes[(int) (Math.random() * 4)];
		String face = faces[(int) (Math.random() * faces.length)];
		// A linha abaixo exibe a carta sorteada
		System.out.println(face + " de " + nipe);

	}
	// As linhas abaixo recuperam de forma aleatórias o conteúdo dos arrays

}
