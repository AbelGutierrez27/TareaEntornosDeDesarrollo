package ejercicio2;
//Importa ArrayList para almacenar las cartas dinámicamente
import java.util.ArrayList;

public class DeckCards {

	public static void main(String[] args) {
		//Definición de palos y valores
		String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
		String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		//Crear un mazo vacío
		ArrayList<Card> deck = new ArrayList<Card>(); // Lista dinámica para almacenar las cartas
		//Generar todas las cartas de la baraja
		for (int i = 0; i < suits.length; i++) { // Recorre cada palo
			for (int j = 0; j < values.length; j++) { // Recorre cada valor
				Card card = new Card(suits[i], values[j]); // Crea una carta con el palo y valor actuales
				deck.add(card); // Añade la carta al mazo
			}
		}
		//Mezclar mazo
		for (int i = 0; i < deck.size(); i++) {
			int j = (int) Math.floor(Math.random() * i); // Genera un índice aleatorio desde 0 hasta i-1
			Card tmp = deck.get(i);	// Guarda temporalmente la carta en la posición i
			deck.set(i, deck.get(j)); // Intercambia la carta en i con la carta en j
			deck.set(j, tmp); // Completa el intercambio
		}
		//Mostrar las primeras 5 cartas del mazo mezclado
		for (int i = 0; i < 5; i++) {
			System.out.println(deck.get(i)); // Imprime cada carta usando el método toString() de la clase Card
		}

	}

}
