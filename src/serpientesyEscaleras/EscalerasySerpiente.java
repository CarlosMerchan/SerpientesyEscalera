package serpientesyEscaleras;

import java.util.Scanner;

import controlador.Controlador;
import modelo.Jugador;
import modelo.Tablero;

public class EscalerasySerpiente {

	public static void main(String[] args) {
		
		realizarPreguntas();
		
	}
	
	//Metodo que realiza las pregunas correspondientes para iniciar el juego
	public static void realizarPreguntas() {
		
		boolean pregunta = true;
		int cantidadJugadores = 0;
		int tamanoTablero = 0;
		Scanner scan = new Scanner(System.in);
		while(pregunta) {
			System.out.println("Por favor Indicar numero de jugadores:");
			cantidadJugadores = scan.nextInt();
			if(cantidadJugadores > 0) {
				System.out.println("Por favor indicar tamano del tablero:"+"\n 1. 5*5"+"\n 2. 8*8"+"\n 3. 10*10");
				tamanoTablero = scan.nextInt();
				pregunta = false;
			}
		}
		
		setJuego(tamanoTablero,cantidadJugadores);
		scan.close();
	}
	
	
	//metodo que da el manejo del programa al controlador y se le pasan como paremetros el tamaño del tablero y la cantidad de jugadores
	public static void setJuego(int tablero, int jugadores) {
		Controlador contralador = new Controlador(tablero,jugadores);
	}

}
