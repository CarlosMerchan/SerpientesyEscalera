package interfaces;

import modelo.Jugador;
import modelo.Tablero;

public interface ITableros {


		
	//metodo que valid la posicion del jugador segun el tablero
	public void validarPosicion(Jugador jugador);
	
	//metodo para validar si el juego ha terminado
	public boolean validarFin(Jugador jugador);
	
	public int getJugada();
	
	public void incrementarJugada();
}
