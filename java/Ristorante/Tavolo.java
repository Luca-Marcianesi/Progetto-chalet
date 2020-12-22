

package ristorante;
import interfacce.OggettoPrenotabile;
import altreClassi.Prenotazione;
/**
 * @author  Edoardo Tarulli
 *
 */


public class Tavolo implements OggettoPrenotabile {
	
	/**
	 * int numeroposti = numero dei posti per ogni tavolo.
	 * prenotazione = oggetto della classe Prenotazione per specificare il nome della prenotazione.
	 * string tipo = specifica cosa io voglio prenotare cio� il tavolo
	 * boolean stato = serve per specificare lo stato appunto della disponibilit� del tavolo.
	 */
		private int numeroposti;
		private boolean stato;
		private Prenotazione prenotazione;
		private String tipo = "tavolo";
		
		
		/**
		 * @param costruttore = prende come argomento il numero delle persone al tavolo.
		 * 
		 */
		public Tavolo ( int numeropersone ) { 
			
			this.numeroposti = numeropersone;
		}
		
		/**
		 * @param numeroposti = Metodo set per il numero dei posti 
		 */
		public void setPosti (int numeroposti) { 
			this.numeroposti = numeroposti;
		}
		
		 
		
		/**
		 * Metodo getPosti per assegnare il numero dei posti
		 * @return numeroposti.
		 * 
		 */
		public int getPosti () {
			return this.numeroposti;
		}
		
		

		/**
		 * Metodo tostring per stampare le informazioni relative alla classe.
		 */
		public String toString () {
			
			return ("Posti:" + this.numeroposti);
		}
		

		/**
		 *  Metodo aggiungi prenotazione per creare una nuova prenotazione.
		 */
		public void aggiungiPrenotazione(String nome) {
			
			this.prenotazione = new Prenotazione (nome);
		}
		

		/**
		 * Metodo getStato per aggiornare la possibilit� di prenotare il tavolo.
		 */
		public boolean getStato () {
			return this.stato;
		}
		
		

		/**
		 * Metodo setStato per vedere lo stato dei tavoli.
		 */
		public void setStato(boolean stato) {
			this.stato = stato;
			
		}
		
		
		/**
		 * Metodo getTipo per specificare il tipo evento ( in questo caso prenoto il tavolo ) nella chiamata postman.
		 */
		public String getTipo() {
			return this.tipo;
		}
		
		
		
		/**
		 * Metodo getPrenotazione per assegnare il valore cio� il numero della prenotazione 
		 * @return
		 */
		public Prenotazione getPrenotazione () {
			return this.prenotazione;
		}
}

