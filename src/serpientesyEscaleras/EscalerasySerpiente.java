package serpientesyEscaleras;

import java.util.Scanner;

import modelo.Jugador;
import modelo.Tablero;

public class EscalerasySerpiente {

	public static void main(String[] args) {
		
		boolean pregunta = true;
		int cantidadJugadores = 0;
		Scanner scan = new Scanner(System.in);
		while(pregunta) {
			System.out.println("Por favor Indicar numero de jugadores:");
			 cantidadJugadores = scan.nextInt();
			if(cantidadJugadores > 0) {
				pregunta = false;
			}
		}
		
		for(int i = 0; i < cantidadJugadores;i++){
			Jugador jugador = new Jugador();
			Tablero tablero = new Tablero(jugador,i+1);
		
		}
		scan.close();
		

	}

}
