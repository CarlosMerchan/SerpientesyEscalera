package controlador;

import java.util.ArrayList;
import java.util.List;


import interfaces.ITableros;
import interfaces.TableroGrande;
import interfaces.TableroMediano;
import interfaces.TableroPequeno;
import modelo.Jugador;


public class Controlador {

	private ITableros tablero;
	private List<Jugador> jugadores;
	boolean play = true;

	public Controlador(int tamano, int cantidadJugadores) {
		crearTablero(tamano);
		crearJugadores(cantidadJugadores);
		iniciarJuego();
	}

	// Metodo que crea al jugador y le asigna el numero del jugador a traves del
	// constructor de la clase Jugador
	private void crearJugadores(int cantidadJugadores) {
		jugadores = new ArrayList<>();
		for (int i = 1; i <= cantidadJugadores; i++) {
			jugadores.add(new Jugador(i));
		}
	}

	//metodo que crea el tablero segun la seleccion del jugador y se le pasa el objeto a la interfaz tablero.
	private void crearTablero(int tamano) {
		switch (tamano) {
		case 1:
			this.tablero = new TableroPequeno();
			break;
		case 2:
			this.tablero = new TableroMediano();
			break;
		case 3:
			this.tablero =  new TableroGrande();
			break;
		}

	}

	//bucle principal del juego
	private void iniciarJuego() {

		while (play) {
			for (Jugador jugador : jugadores) {
				Movimientos.avanzar(this.tablero.getJugada(),jugador);
				this.tablero.incrementarJugada();
				play = this.tablero.validarFin(jugador);
				
			}

		}
	}
	
	

}
