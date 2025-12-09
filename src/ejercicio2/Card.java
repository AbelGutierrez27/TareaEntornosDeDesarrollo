package ejercicio2;
//Clase que representa una carta individual de una baraja
public class Card {
	//Atributos de la carta
	public String suit; //palo de la carta
	public String value;//valor de la carta
	//Constructor de la carta
	public Card (String suit, String value) {
		this.suit = suit; // Asigna el palo recibido al atributo suit
		this.value = value; // Asigna el valor recibido al atributo value
	}
	//mostrar la carta como texto
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}
