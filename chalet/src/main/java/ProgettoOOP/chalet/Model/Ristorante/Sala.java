package ProgettoOOP.chalet.Model.Ristorante;

import ProgettoOOP.chalet.Model.Liste.ListaOggettiPrenotabili;

//@author DiegoMignani
//@author Edoardo Tarulli
//@author Marcianesi Luca

public class Sala extends ListaOggettiPrenotabili<Tavolo>{
	
	/**
	 * Metodo che prende in ingresso i parametri richiesti per una prenotazione del tavolo cio�
	 * richiesta(tavolo), nome e numero delle persone. Il metodo cerca se esiste un oggetto tavolo
	 * con il numero di posti necessari. Se � disponibile lo prenota e aggiunge un oggetto prenotazione
	 * e restituisce true. Se la prenotazione invece non � stato possibile effettuarla, restituisce false.
	 */
	
	public boolean prenota(String richiesta,String nome,int numPers){
		for(Tavolo tavolo : super.lista) {
			
			if(richiesta.equalsIgnoreCase(tavolo.getTipo()) && tavolo.getStato()&&tavolo.controlloPosti(numPers)) {
				tavolo.setStato(false);
				tavolo.aggiungiPrenotazione(nome);
				return true;
			}	
	  }
	return false;
	}
	
}
